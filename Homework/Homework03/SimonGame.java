// SimonGame.java
// an interactive memory game created using Java with love <3
// to run this program: C>java SimonGame
/////////////////////////////////////////////////////////
import java.util.Scanner;
import java.util.Random;

public class SimonGame {
    public static void play() {
        Letter red      = new Letter('R', "simonSound1.wav"); // instantiate letter w/ corresponding beeps
        Letter green    = new Letter('G', "simonSound2.wav");
        Letter yellow   = new Letter('Y', "simonSound3.wav");
        Letter blue     = new Letter('B', "simonSound4.wav");
        Letter[] pick   = {red, green, yellow, blue};         // make array of possible letter to pick from
        Scanner read    = new Scanner(System.in);
        String myStr    = "";                                 // array I generate
        String userStr  = "";                                 // user's answer
        Random rannyBoy = new Random();                       // object to pick randomly from array.
        int count       = 1;                                  // tracker of string length

        do {
            userStr = "";       // empty the user's answer for next round
            if (count > 1) {    // if there is more than one letter in the generated string, read them out and add a new one
                for (int i = 0; i < myStr.length(); i++) {
                    System.out.println(myStr.substring(0, i));
                    switch (myStr.charAt(i)) {
                        case 'R':
                            red.beep();
                            break;
                        case 'G':
                            green.beep();
                            break;
                        case 'Y':
                            yellow.beep();
                            break;
                        case 'B':
                            blue.beep();
                            break;
                    }
                    System.out.print("\033[H\033[2J");  // clear the screen after every new letter that "beeps"
                }

                Letter ran = pick[rannyBoy.nextInt(pick.length)];  // add the new letter and clear the screen
                myStr += ran.let;
                System.out.println(myStr);
                ran.beep();
                System.out.print("\033[H\033[2J");
            } else {
                Letter ran = pick[rannyBoy.nextInt(pick.length)];  // add *A* new letter and clear the screen
                myStr += ran.let;
                System.out.println(myStr);
                ran.beep();
                System.out.print("\033[H\033[2J");
            }


            System.out.print("\033[H\033[2J");                         // clear screen one more time (just in case)

            System.out.println("YOUR TURN:- ");                        // await user's answer
            userStr = read.nextLine();
            count++;                                                   // increment number of rounds
        } while (myStr.equalsIgnoreCase(userStr));                     // keep running until user messes up

    }


    public static void main(String[] args) { // play() will be called here, in a loop in case user wants to play again
        String ans = "";                        // variables to read and store user's answer
        Scanner input = new Scanner(System.in);

        do{
            play();
            System.out.println("One More Time? (Y/N)");
            ans = input.next();
        }while(ans.equalsIgnoreCase("Y"));  // give user illusion of choice, when in reality he
                                            // must play until the heat death of the universe...
    }
}
