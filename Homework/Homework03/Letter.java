// Letter.java
// class representing each possible letter in Simong Game
// to run this program: C>java SimonGame
/////////////////////////////////////////////////////////
import java.io.File;                        // importing packages necessary for sounds to be played
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Letter {
    char let;
    File sound;

    public Letter(char letter, String soundFile) { // takes in a char and a sounds file
        let = letter;
        sound = new File(soundFile);
    }

    public void beep() { // play the corresponding sound to the letter when called
        try {
            Clip part = AudioSystem.getClip();
            part.open(AudioSystem.getAudioInputStream(sound));
            part.start();

            Thread.sleep(part.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.out.println("Whoopsie!");  // exception handling, shouldn't be seen by user.
        }
    }
}
