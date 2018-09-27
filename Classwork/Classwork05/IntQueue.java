   /** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntQueue.java
 * Purpose    : Manipulating IntQueue
 * @author    :  Kevin Solis
 * Date       :  2018-09-27
 * Notes      :  None
 * Warnings   :  None
*/
   public class IntQueue {

      IntLinkedList myQueue;

      IntQueue() {
         myQueue = new IntLinkedList();         // constructor
      }

      public void push( int itemToPush ) {
         myQueue.prepend( itemToPush );
      }

      public int peek() {
         return myQueue.getIteratorAt( myQueue.getSize() -1 ).getCurrentInt();     // we use the iterator
      }

      public int pop() {
         return myQueue.removeAt( myQueue.getSize() - 1  );
      }

      public static void main( String[] args ) {
         IntQueue testQueue = new IntQueue();
         testQueue.push( 19 );
         testQueue.push( 23 );
         testQueue.push( 29 );
         testQueue.push( 31 );
         testQueue.push( 37 );
         testQueue.push( 41 );
         testQueue.push( 43 );
         testQueue.push( 47 );
         testQueue.push( 51 );
         testQueue.push( 57 );
         System.out.println( "The bottom of the  stack: " + testQueue.peek() );      // 19
         System.out.println( "Removing bottom thing: " + testQueue.pop() );         // 19 removed
         System.out.println( "The bottom of the stack: " + testQueue.peek() );      // 23
         System.out.println( "Removing bottom thing: " + testQueue.pop() );         // 23 removed
         System.out.println( "The bottom of the stack: " + testQueue.peek() );      // 29
         System.out.println( "Removing bottom thing: " + testQueue.pop() );         // 29 removed
         System.out.println( "The bottom of the stack: " + testQueue.peek() );      // 31
         testQueue.push( testQueue.pop() + testQueue.pop() );
         System.out.println( "The bottom of the stack: " + testQueue.peek() );      // 68 what'll it be?
      }

   }
