/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  IntLinkedList.java
 * Purpose    : Manipulating IntLinkedList
 * @author    :  Kevin Solis
 * Date       :  2018-09-19
 * Notes      :  None
 * Warnings   :  None
*/    
   public class IntLinkedList {

      private Node head;
      private int  size;

     // the constructor
      IntLinkedList() {
         head = null;
         size = 0;
      }

      public int getSize() {
         return size;
      }

      public void prepend( int dataToAdd ) {
         Node currentHead = head;
         head = new Node( dataToAdd );
         head.next = currentHead;
         size++;
      }

      public void insertAt(int index, int dataToAdd){
         if(index == 0){
            prepend(dataToAdd);
         }
         else if( (index > size) || (index < 0) ) {
            throw new IllegalArgumentException();
         }
         else{
         Iterator finder = getIteratorAt(index-1);
         Node indexNode = new Node(dataToAdd);
         indexNode.next = finder.currentNode.next;
         finder.currentNode.next = indexNode;
         size++;
      }
   }

      public int removeAt(int index){
         int storage;
         if(index == 0){
            storage = head.data;
            head = head.next;
            return storage;
         }
         else if( (index > size) || (index < 0) ) {
            throw new IllegalArgumentException();
         }
         else{
         Iterator finder = getIteratorAt(index);
         Iterator del = getIteratorAt(index - 1);
         Node indexNode = finder.currentNode.next;
         storage = del.getCurrentInt();
         del.currentNode.next = indexNode;
         size--;
         return storage;
      }
   }


      private class Node {

         int data;            // remember this is an IntLinkedList
         Node next;           // here's the self-referential part

         // constructor
         Node( int d ) {
            data = d;
            next = null;
         }
      }

      public Iterator getIteratorAt( int index ) {
         if( (index > size) || (index < 0) ) {
            throw new IllegalArgumentException();
         }
         Iterator it = new Iterator();
         while( index > 0 ) {
            it.next();
            index--;
         }
         return it;
      }

      public class Iterator {
         private Node currentNode;

         Iterator() {
            currentNode = head;
         }

         public void next() {
            if( currentNode == null ) {
               return;
            } else {
               currentNode = currentNode.next;
            }
         }

         public boolean hasNext() {
            return ((currentNode != null) && (currentNode.next != null));
         }

         public int getCurrentInt() {
            return currentNode.data;
         }

      }
   }
