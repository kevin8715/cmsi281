// HashTableFolding.java
// java implementation of hashing function table for strings with linear probe
// to run this program: c> java HashTableApp
//code was borrowed from Lafore Book as a template, modified to meet assigment requirments
//////////////////////////////////////////////////
class HashTableFolding
{
	private DataItem2[] hashArray; // array holds hash table private int arraySize;
	private DataItem2 nonItem; // for deleted items
	private int arraySize;
// -------------------------------------------------------------
    public HashTableFolding(int size) // constructor 
    {
		arraySize = size;
		hashArray = new DataItem2[arraySize];
		nonItem = new DataItem2 (-1); // deleted item key is ""
	}
// ------------------------------------------------------------- 
	public void displayTable()
	{
		System.out.print("Table: "); for(int j=0; j<arraySize; j++)
		{
			if(hashArray[j] != null)
			System.out.print(hashArray[j].getKey() + " "); 
		else
			System.out.print("** "); 
	        }
			System.out.println("");
		}
// -------------------------------------------------------------
    public int hashFunc(int key) 
    {	
		//int hashVal = 0;
    int count = findDigits(arraySize)-1;
    int divisions = key/count;
    int sum = 0;
    int storage = 0;
    for(int i = 1; i<divisions; i++){
      sum+= key%((int)(Math.pow(10,count)));
      key = key/((int)(Math.pow(10,count)));
    }
    int sumCount = findDigits(sum);
    if(sumCount > (count+1)){
      sum = sum%((int)Math.pow(10,sumCount-(count+1)));
	   } 
     return sum;
  }
// -------------------------------------------------------------
  public int findDigits(int number){
    int count =0;
    while(number != 0){
      number = number/10;
      count ++;
    }
    return count;
  }
// -------------------------------------------------------------
  public void insert(DataItem2 item) // insert a DataItem2
// (assumes table not full)
    {
    int key = item.getKey(); // extract key 
    int hashVal = hashFunc(key); // hash the key
								// until empty cell or -1, 
	while(hashArray[hashVal] != null &&
	                hashArray[hashVal].getKey() != -1)
    {
    	++hashVal; // go to next cell
    	hashVal %= arraySize; // wraparound if necessary
    }
    hashArray[hashVal] = item; // insert item 
    } // end insert()
// ------------------------------------------------------------- 
   public DataItem2 delete(DataItem2 key) // delete a DataItem2
    {
    int hashVal = hashFunc(key.getKey()); // hash the key

    while(hashArray[hashVal] != null) // until empty cell, 
    {                 // found the key? 
      if(hashArray[hashVal].getKey() == key.getKey())
      {
        DataItem2 temp = hashArray[hashVal]; // save item
        hashArray[hashVal] = nonItem;  // delete item
        return temp;    //return item
      }
      ++hashVal;  // go to next cell
      hashVal %= arraySize; // wraparound if necessary
    }
    return null;   // can’t find item
    } // end delete()
// -------------------------------------------------------------
public DataItem2 find(int key) // find item with key 
   {
   int hashVal = hashFunc(key); // hash the key
   while(hashArray[hashVal] != null) // until empty cell, 
   { // found the key? 
   	if(hashArray[hashVal].getKey() == key)
   	  return hashArray[hashVal]; // yes, return item
   	++hashVal;// go to next cell
   	hashVal %= arraySize; // wraparound if necessary
   }
   return null; // can’t find item
}
// -------------------------------------------------------------
} // end class HashTable ////////////////////////////////////////////////////////////////