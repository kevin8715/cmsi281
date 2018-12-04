// HashTable.java
// java implementation of hashing function table for strings with linear probe
// to run this program: c> java HashTableApp
//code was borrowed from Lafore Book as a template, modified to meet assigment requirments
//////////////////////////////////////////////////
class HashTable
{
	private DataItem[] hashArray; // array holds hash table private int arraySize;
	private DataItem nonItem; // for deleted items
	private int arraySize;
// -------------------------------------------------------------
    public HashTable(int size) // constructor 
    {
		arraySize = size;
		hashArray = new DataItem[arraySize];
		nonItem = new DataItem(""); // deleted item key is ""
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
    public int hashFunc(String key) 
    {	
		int hashVal = 0;
		for(int j=0; j<key.length(); j++)
			{
				int letter = key.charAt(j) - 96; 
				hashVal = (hashVal * 27 + letter) % arraySize;
			}
			return hashVal;
	} // end hashFunc3()
// -------------------------------------------------------------
    public void insert(DataItem item) // insert a DataItem
// (assumes table not full)
    {
    String key = item.getKey(); // extract key 
    int hashVal = hashFunc(key); // hash the key
								// until empty cell or -1, 
	while(hashArray[hashVal] != null &&
	                hashArray[hashVal].getKey() != "")
    {
    	++hashVal; // go to next cell
    	hashVal %= arraySize; // wraparound if necessary
    }
    hashArray[hashVal] = item; // insert item 
    } // end insert()
// ------------------------------------------------------------- 
    public DataItem delete(String key) // delete a DataItem
    {
    int hashVal = hashFunc(key); // hash the key

    while(hashArray[hashVal] != null) // until empty cell, 
    { 								// found the key? 
    	if(hashArray[hashVal].getKey() == key)
    	{
    		DataItem temp = hashArray[hashVal]; // save item
    		hashArray[hashVal] = nonItem;  // delete item
    		return temp;    //return item
    	}
    	++hashVal;  // go to next cell
    	hashVal %= arraySize; // wraparound if necessary
    }
    return null;   // can’t find item
    } // end delete()
// -------------------------------------------------------------
public DataItem find(String key) // find item with key 
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