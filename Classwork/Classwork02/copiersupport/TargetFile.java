/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  TargetFile.java
 * Purpose    : Copies files
 * @author    :  Kevin Solis
 * Date       :  2017-04-19
 * Notes      :  None
 * Warnings   :  None
 *Credits: https://stackoverflow.com/questions/16265693/how-to-use-buffered-reader-in-java
 * https://stackoverflow.com/questions/6840788/when-should-i-close-a-bufferedwriter
 *Used the above sources to figure out how to use BufferedWriter and get all the formating correct like the right imports.
*/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
package copiersupport;

public class TargetFile{
	public TargetFile(String temp, String input){
			BufferedWritter content = new BufferedWriter (new FileWriter(input));
			content.write(temp);
			content.flush();
	}

}