// DataItem.java
// demonstrates DataItem table with linear probing and working with strings
// to run this program: C:>java DataItemTableApp
// template from Lafore book modified for assigment requirments
import java.io.*; 
//////////////////////////////////////////////////////////////// 
class DataItem
  { // (could have more data)
  private String iData; // data item (key) //--------------------------------------------------------------
  public DataItem(String ii) // constructor 
  { 
  	iData = ii; 
  }
//-------------------------------------------------------------- 
  public String getKey()
  { 
  return iData; 
  } //--------------------------------------------------------------
} // end class DataItem 
////////////////////////////////////////////////////////////////