/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  HighArrayApp.java
 * Purpose    : App for highArray.java
 * @author    :  Kevin Solis
 * Date       :  2018-09-18
 * Notes      :  None
 * Warnings   :  None
*/   
 class HighArrayApp
   {
   public static void main(String[] args)
   	{
   		int maxSize = 100;  // array size
   		HighArray arr;  // reference to array
   		arr = new HighArray(maxSize);  // create the array

   		arr.insert(77);  // insert 10 times
   		arr.insert(99); 
   		arr.insert(44); 
   		arr.insert(55); 
   		arr.insert(22); 
   		arr.insert(88); 
   		arr.insert(11); 
   		arr.insert(00); 
   		arr.insert(66); 
   		arr.insert(33);
         long max1 = arr.getMax();
         System.out.println(max1); // should be 99

         arr.insert(213);
         arr.insert(4435);
         arr.insert(76421);
         arr.insert(0);
         arr.insert(1);
         long max2 = arr.getMax();
         System.out.println(max2); // should be 76421

         arr.insert(11);
         arr.insert(55);
         arr.insert(22);
         arr.insert(11);
         arr.insert(11);
         arr.insert(22);

   		arr.display();  //display times

         arr.noDups();
         arr.display(); //testing noDups

   		int searchKey = 35;  //search for item
   		if( arr.find(searchKey) )
   			System.out.println("Found " + searchKey); 
   		else
   			System.out.println("Can’t find " + searchKey);
   		arr.delete(00);  // delete 3 items
   		arr.delete(55); 
   		arr.delete(99);

   		arr.display();  //display items again
   		} // end main()
   	} // end class HighArrayApp
////////////////////////////////////////////////////////////////