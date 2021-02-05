package collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTables {
	public static void main(String[] args) {
		Hashtable<String,String> ht = new Hashtable<>();
		ht.put("Supriya", "Maddula");
		ht.put("Jahnavi", "Yara");
		ht.put("Jhansi", "Bandaru");
		
		System.out.println("Hash Table after insertion: ");
		for(Map.Entry m : ht.entrySet()) {
			System.out.println("First Name: " + m.getKey() + " , " + "Surname: " + m.getValue());
		}
		
		ht.remove("Jhansi");
		System.out.println("Hash Table after deletion: ");
		for(Map.Entry m : ht.entrySet()) {
			System.out.println("First Name: " + m.getKey() + " , " + "Surname: " + m.getValue());
		}
	}
}
