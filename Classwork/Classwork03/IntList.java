 /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntList.java
 * Purpose    : Create and manage int arrays
 * @author    :  Kevin Solis
 * Date       :  2018-09-13
 * Notes      :  None
 * Warnings   :  None
*/
 public class IntList implements IntListInterface {
      private int[] theList;
      private int   size;

      private static final int STARTING_SIZE = 19;    // defines starting size; don't worry, we'll deal

      public IntList() {                        // doesn't HAVE to be declared public, but doesn't hurt
         theList = new int[STARTING_SIZE];
         size = 0;
      }

      public int getValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
         if( size == 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The list is empty!" );   // maybe not the best...
         } else if( index > size ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
         } else if( index < 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too small");
         } else {
            return theList[index];
         }
      }

      public boolean append( int valueToAdd ) {
         if( size < theList.length ) {
            theList[size] = valueToAdd;
            size++;
            return true;
         } else {
            // what should we do here, if there's no room?
         }
         return false;
      }


      public int removeValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
         int value = theList[index];
         if( size == 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The list is empty!" );   // maybe not the best...
         } else if( index > size ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
         } else if( index < 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too small");
         } else {
            holeFiller( index );
         }
         return value;
      }

      private void holeFiller( int index ) {
         for( int i = index; i < size - 1; i++ ) {
            theList[i] = theList[i+1];
         }
         size--;
      }

      public void checkIndex (int index){
         if(index < 0){
            throw new ArrayIndexOutOfBoundsException("The index value can't be negative.");
         }
         else if( index > size ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
         }
         else if( index < 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too small");
         }
      }
      public boolean prepend( int valueToAdd ) {
         if( size < theList.length ) {
            holeFiller(0);
            theList[0] = valueToAdd;
            return true;
         } else {
            // what should we do here, if there's no room?
         }
         return false;
      }


      // we've gotta have this to actually get things to compile
      public boolean insertValueAtIndex( int value, int index ) {
         checkIndex(index);
         if( size < theList.length ) {
            holeFiller(index);
            theList[index] = value;
            return true;
         } else {
           int[] storage = theList;
           theList = new int[storage.length+STARTING_SIZE];
           for(int i = 0; i<storage.length; i ++){
            theList[i] = storage[i];
           }
           insertValueAtIndex(value, index);
         }
         return false;
      }

      public static void main( String[] args ) {
         IntList list = new IntList();
         list.append( 2 );
         list.append( 3 );
         list.append( 5 );
         list.append( 7 );
         System.out.println( list.getValueAtIndex( 3 ) );   // should return the value 7
         list.append( 11 );
         list.append( 13 );
         list.append( 17 );
         list.append( 19 );
         System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 19
         System.out.println( list.removeValueAtIndex( 3 ) );   // should return the value 7
         System.out.println( list.getValueAtIndex( 3 ) );      // should return the value 11
         list.prepend( 1 );
         System.out.println( list.getValueAtIndex( 0 ) );
         list.insertValueAtIndex(2,2);
         System.out.println( list.getValueAtIndex(2));
         list.checkIndex(20);
      }
   }
           
