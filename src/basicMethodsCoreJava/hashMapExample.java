package basicMethodsCoreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first one is for key second is for value: <KEY,VALUE>
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//Put value into key:
		hm.put(0, "Hello");
		hm.put(1, "Goodbye");
		hm.put(42, "Morning");
		hm.put(3, "Evening");
		
		//This will print the value in 42 key.
		System.out.println(hm.get(42));
		hm.remove(42);
		System.out.println(hm.get(42));
		
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
