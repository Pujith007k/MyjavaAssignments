package collectionsandmaps;
import java.util.*;

public class Linkedhashmap {
	// Java Program to Demonstrate Working of LinkedHashMap
// Main driver method
public static void main(String a[])
		{

			// Creating an empty LinkedHashMap
			LinkedHashMap<Integer,String> lhm= new LinkedHashMap<Integer,String>();

			// Adding entries in Map
			// using put() method
			lhm.put(1, "apple");
			lhm.put(2, "banana");
			lhm.put(3, "orange");
			lhm.put(4, "grapes");
			lhm.put(5, "jackfruit");
			lhm.put(6, "watermelon");
			lhm.put(7, "blackgrapes");
			lhm.put(8, "kiwi");
			lhm.put(9, "dates");
			lhm.put(10, "javafruit");
			

			// Printing all entries inside Map
			System.out.println(lhm);
			System.out.println("Mappings of LinkedHashMap : "+ lhm);
			System.out.println("delete element 4: "+ lhm.remove(4));
			System.out.println("delete element 7: "+ lhm.remove(4));
			System.out.println("banana" + lhm.containsValue("banana"));
			System.out.println("apple" + lhm.containsValue("apple"));
			System.out.println("Contains key 4? "+ lhm.containsKey(4));
	}


}
