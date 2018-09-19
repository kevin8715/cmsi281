/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * File name  :  highArray.java
 * Purpose    : Manipulating high arrays
 * @author    :  Kevin Solis
 * Date       :  2018-09-18
 * Notes      :  None
 * Warnings   :  None
*/   
class HighArray
{
	private long[] a; // ref to array a
    private int nElems; // number of data items 
    private long CONSTANT = -923809128;
    //-----------------------------------------------------------
    public HighArray(int max) // constructor
    {
    	a = new long[max]; // create the array
    	nElems = 0; // no items yet
    } 
    //----------------------------------------------------------- 
   public boolean find(long searchKey)
   {                     // find specified value
   	int j;
   	for(j=0; j<nElems; j++)     // for each element,
   		if(a[j] == searchKey)   // found item?
   		   break;
   		if(j == nElems)         // gone to end?
   			return false;       //yes, can't find it
   		else
   			return true;        //no, found it
   	} // end find()
  //----------------------------------------------------------- 
   	public void insert(long value) // put element into array
   	{
   		a[nElems] = value;         // insert it
   		nElems++;                  //increment size
   	}
//----------------------------------------------------------- 
   	public boolean delete(long value)
   	{
   		int j;
   		for(j=0; j<nElems; j++)    // look for it
   			if( value == a[j] ) 
   				break;
   			if(j==nElems)          // can't find it
   				return false;
   			else {                 // found it
   				for(int k=j; k<nElems; k++)  //move higher ones down
   					a[k] = a[k+1];
   				nElems--;          // decrement size
   				return true; 
   			}
   	} // end delete() 
   	//----------------------------------------------------------- 
   	public void display() // displays array contents
   	{
   	for(int j=0; j<nElems; j++) // for each element,
   	   System.out.print(a[j] + " "); // display it 
   	System.out.println("");
   }
   public long getMax(){
   	long storage = -1;
   	for(int j=0; j<nElems; j++){
   		if(a[j] > storage){
   			storage = a[j];
   		}
   	}
   	return storage;
   }
   public void noDups(){
   	long[] storage = new long[nElems];
   	int count = 0;
    int count2 = 0;
   	for(int j=0; j<nElems; j++){
   		for(int i=0+j+1; i<nElems; i++){
   			if(a[j] == a[i] && a[j]!= CONSTANT && a[i] != CONSTANT ){
   				a[j] = CONSTANT;
   				count++;
   			}
   		 }
   	  }
   	  for(int p = 0; p<nElems; p++){
   	  	if(a[p]!= CONSTANT){
   	  		storage[count2] = a[p];
          count2++;
   	  	}
      }
   	  for(int r = 0; r<nElems; r++){
   	  	a[r] = storage[r];
   	  }	
   	  nElems = nElems - count;

   }
   //-----------------------------------------------------------
} // end class HighArray 
   //////////////////////////////////////////////////////////////// 
 