/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntListInterface.java
 * Purpose    : Interface for IntList.java
 * @author    :  Kevin Solis
 * Date       :  2018-09-13
 * Notes      :  None
 * Warnings   :  None
*/   
   public interface IntListInterface {
      int getValueAtIndex( int index );
      boolean append( int valueToAdd );
      boolean insertValueAtIndex( int value, int index );
      int removeValueAtIndex( int index );
      boolean prepend( int valueToAdd );
      void checkIndex (int index);

   }
      
