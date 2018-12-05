// hash.java
// demonstrates hash table with linear probing and working with strings
// to run this program: C:>java HashTableApp
// template from Lafore book modified for assigment requirments
import java.io.*; 
//////////////////////////////////////////////////////////////// 
class DataItem2
  { // (could have more data)
  private int iData; // data item (key) //--------------------------------------------------------------
  public DataItem2
(int ii) // constructor 
  { 
  	iData = ii; 
  }
//-------------------------------------------------------------- 
  public int getKey()
  { 
  return iData; 
  } //--------------------------------------------------------------
} // end class DataItem2 
////////////////////////////////////////////////////////////////F