/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  MyFilerCopier.java
 * Purpose    : Copies files
 * @author    :  Kevin Solis
 * Date       :  2017-04-19
 * Notes      :  None
 * Warnings   :  None
 *
*/
import java.io.FileReader; // probably don't need this but in case
import java.io.FileWriter; //
import java.io.IOException;
import copiersupport.*;
import copiersupport.TargetFile;
import copiersupport.SourceFile;
import java.io.IOException;

public class MyFilerCopier {
	public static void main( String args[] ) throws java.io.IOException {
	System.out.println("Hello person.");
	System.out.println("Please input your file name.");
	Scanner myInput = new Scanner (System.in);
	String inputName = myInput.nextLine();
	SourceFile input = new SourceFile(inputName);
	TargetFile output = new TargetFile(source.returnContent(), inputName +".copy");
	}
}