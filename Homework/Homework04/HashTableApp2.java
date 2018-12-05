// HashTableApp.java
// java program to run HashTable.java
// to run this program: c> java HashTableApp
//////////////////////////////////////////////////
class HashTableApp2
  {
  	public static void main(String[] args) 
  	{
  		HashTableFolding h = new HashTableFolding(2000);
  		DataItem2 d = new DataItem2(82173);
  		DataItem2 d1 = new DataItem2(817293);
  		DataItem2 d2 = new DataItem2(23);
  		DataItem2 d3 = new DataItem2(0);
  		DataItem2 d4 = new DataItem2(-1);
  		DataItem2 d5 = new DataItem2(7854);
      DataItem2 d6 = new DataItem2(82173);
  		h.insert(d);
      h.insert(d);
  		h.insert(d1);
  		h.insert(d2);
  		h.insert(d3);
  		h.insert(d4);
  		h.insert(d5);
  		h.delete(d5);

  		h.displayTable();
  	}
} // end class HashTableApp
////////////////////////////////////////////////////////////////