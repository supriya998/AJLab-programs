package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1202, "Jhansi");
		hm.put(1211, "Jahnavi");
		hm.put(1216, "Divya");
		hm.put(1217, "Santoshi");
		hm.put(1219, "Prabha");
		hm.put(1220, "Supriya");
		hm.put(1221, "Sanjana");
		
		Set keys = hm.entrySet();
		Iterator itr = keys.iterator();
		
		System.out.println("HashMap after insertion:");
		while(itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
		
		hm.remove(1221);
		System.out.println("HashMap after deletion:");
		Iterator itr1 = keys.iterator();
		while(itr1.hasNext()) {
			Map.Entry me = (Map.Entry)itr1.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
		
		hm.replace(1202,"Priyanka");
		System.out.println("HashMap after replace operation:");
		Iterator itr2 = keys.iterator();
		while(itr2.hasNext()) {
			Map.Entry me = (Map.Entry)itr2.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue()); 
		}
	}
}
