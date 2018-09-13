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
   public interface IntListInterface {
      int getValueAtIndex( int index );
      boolean append( int valueToAdd );
      boolean insertValueAtIndex( int value, int index );
      int removeValueAtIndex( int index );
      boolean prepend( int valueToAdd );
      void checkIndex (int index);

   }
      