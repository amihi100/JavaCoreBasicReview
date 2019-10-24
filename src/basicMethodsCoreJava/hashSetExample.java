package basicMethodsCoreJava;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashSet treeset, LinkedHashset implements set interface
		//Does NOT accept duplicate values.
		//There is no guarantee elements stored in sequential order.
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		//hs as removed the INDIA value because its already stored.
		System.out.println(hs);
		hs.remove("UK");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		//ITERATOR: (
		System.out.println("ITERATOR has a pointer propeties, if you want to print 2nd element:");
		Iterator<String> i = hs.iterator();

		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("12"); 
		System.out.println(i.next()); // Nothing will be printed. ERROR --> java.util.NoSuchElementException
		System.out.println(i.next()); // Nothing will be printed. EORROR--> java.util.NoSuchElementException
		
	}

}
