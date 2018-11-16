import java.util.ArrayList;
/*
   * Now the Heap itself, composed of an ArrayList of HeapNodes;
   *  using the ArrayList allows us to expand the heap as we need to,
   *  and still lets us use the HeapNode class as the data items in
   *  the Heap Array...
   */
   public class BinaryHeap {

      private ArrayList<HeapNode> uriah;
      private int size;

      BinaryHeap() {
         uriah = new ArrayList<HeapNode>();
         size = 0;
      }

     // First some low-hanging fruit; let's do the traversal helpers
     //  that do the indexing operations we'll need to use to find
     //  stuff in the heap
      public HeapNode getParent( int index ) {
         return uriah.get( (index - 1) / 2 );
      }

      public HeapNode getChild( int index, char child ) {
         int result = (index * 2) + 1;
         if( Character.toUpperCase( child ) == 'R') {   // make sure we're case insensitive!
            result++;
         }
         return uriah.get( result );
      }

     // this just prints the array values; it's left to the observer to figure out
     //  which HeapNode is which, in terms of parent and child
      public void print() {
         for( int i = 0; i < size; i++ ) {
            System.out.print( "[" + uriah.get( i ).getKey() + "]" );
         }
      }

     // Now we can handle insertions.  ArrayList has a nice "add" method
     //  that makes things easy.  We *DO* have to deal with the primitive
     //  to Object situation, but that's trivial...
      public void insert( int value ) {
         uriah.add( new HeapNode( value ) );
         bubbleUp( size );                 // WOW that was easy!
         size++;
      }

     // Here's the bubble method that does the swappy thang....
     //  Whaddya mean?!  OF COURSE it's recursive!  Fuggeddaboutit...
      public void bubbleUp( int index ) {
         if( index == 0 ) {   // base case:
            return;           //  we're already at the root, so we're done
         }

         HeapNode parent = getParent( index );
         int parentIndex = (index -1) / 2;
         if( uriah.get( parentIndex ).getKey() < uriah.get( index ).getKey() ) {
            HeapNode temp = uriah.get( index );
            uriah.set( index,  uriah.get( parentIndex ) );
            uriah.set( parentIndex, temp );
            bubbleUp( parentIndex );
         }
      }

      public static void main( String[] args ) {

         // YOUR TEST CODE GOES HERE
        
      }
   }