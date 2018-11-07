class oddEvenSortApp
{
public static void main(String[] args)
{
	int maxSize = 100;  // array size
	oddEvenSort arr;  // reference to array
	arr = new oddEvenSort(maxSize);  // create the array

	arr.insert(77);  // insert 10 items
	arr.insert(99); 
	arr.insert(44); 
	arr.insert(55); 
	arr.insert(22); 
	arr.insert(88); 
	arr.insert(11); 
	arr.insert(00); 
	arr.insert(66); 
	arr.insert(33);
	for(int i = 0; i<5; i++){
		arr.insert((int)(Math.random()*80));
	}

	arr.display();  // display items
	System.out.println("");

	arr.generalSort(); // bubble sort them
	arr.display(); // display them again

	oddEvenSort arr2 = new oddEvenSort(maxSize);
	for(int j = 0; j<99; j++){
		arr2.insert((int)(Math.random()*200));
	}

	arr2.display();  // display items
	System.out.println("");

	arr2.generalSort(); // bubble sort them
	arr2.display(); // display them again
		
	} // end main()
} // end class BubbleSortApp
////////////////////////////////////////////////////////////////
