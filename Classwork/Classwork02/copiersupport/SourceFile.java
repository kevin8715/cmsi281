/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  SourceFile.java
 * Purpose    : Copies files
 * @author    :  Kevin Solis
 * Date       :  2017-04-19
 * Notes      :  None
 * Warnings   :  None
 *Credits: https://stackoverflow.com/questions/16265693/how-to-use-buffered-reader-in-java
 *Used the above source to figure out how to use BufferedReader and get all the formating correct like the right imports.
*/
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
package copiersupport;

public class SourceFile{
	private String storage;
	public String returnContent(){
		return storage;
	}
	public SourceFile(String input){
			Bufferedreader temp = new BufferedReader(new FileReader(input));
			storage = temp.readLine();
		} 
	}
}