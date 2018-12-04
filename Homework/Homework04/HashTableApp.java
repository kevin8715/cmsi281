// HashTableApp.java
// java program to run HashTable.java
// to run this program: c> java HashTableApp
//////////////////////////////////////////////////
class HashTableApp
  {
  	public static void main(String[] args) 
  	{
  		HashTable h = new HashTable(100);
  		DataItem d = new DataItem("word");
  		DataItem d1 = new DataItem("pie");
  		DataItem d2 = new DataItem("lettuce");
  		DataItem d3 = new DataItem("no");
  		DataItem d4 = new DataItem("hummingbird");
  		DataItem d5 = new DataItem("yes");
  		h.insert(d);
  		h.insert(d1);
  		h.insert(d2);
  		h.insert(d3);
  		h.insert(d4);
  		h.insert(d5);
  		h.displayTable();
  	}
} // end class HashTableApp
////////////////////////////////////////////////////////////////