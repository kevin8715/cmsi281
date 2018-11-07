// bubbleSort.java
// demonstrates bubble sort
// to run this program: C>java BubbleSortApp 
//////////////////////////////////////////////////////////////// 
class oddEvenSort
  {
  private long[] a; // ref to array a 
  private int nElems; // number of data items
//--------------------------------------------------------------
  public oddEvenSort(int max) 
  {
	a = new long[max]; 
	nElems = 0;
}
// constructor
// create the array // no items yet
//--------------------------------------------------------------
public void insert(long value) // put element into array
{ 
	a[nElems] = value; // insert it
	nElems++; // increment size
}
//-------------------------------------------------------------- 
public void display() // displays array contents
{
for(int j=0; j<nElems; j++) // for each element,
System.out.print(a[j] + " "); // display it System.out.println(“”);
}
//-------------------------------------------------------------- 
public void evenSort()
 {
 	int out, in;
 	boolean evenPair;
 	boolean swapping;
 		for(in=0; in<nElems; in+=2){ // inner loop (forward)
 			swapping = a[in] > a[in+1];
 			if(swapping) // out of order?
 				swap(in, in+1); // swap them
 			}
 	}
 //--------------------------------------------------------------

public void oddSort()
 {
 	int out, in;
 	boolean swapping;
 		for(in=1; in<nElems-1; in+=2){ // inner loop (forward)
 			swapping = a[in] > a[in+1];
 			if( swapping ) // out of order?
 				swap(in, in+1); // swap them
 			}
 	} 
 //--------------------------------------------------------------

public void generalSort(){
	//for(int i = 0; i<20; i++){
	while(notInOrder()){
	evenSort();
	oddSort();
	}
}

public boolean notInOrder(){
	boolean order = false;
	for(int i = 0; i<nElems-1; i++){
		if(a[i] > a[i+1])
			order = true;
	}
	return order;
}
private void swap(int one, int two) 
{
	long temp = a[one]; 
	a[one] = a[two]; 
	a[two] = temp;
}
//-------------------------------------------------------------- 
} // end class ArrayBub
//////////////////////////////////////////////////////////////// 