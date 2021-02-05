package collections;

import java.util.ArrayList;

public class ArrayLists {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Supriya");
		al.add("Jahnavi");
		al.add("Jhansi");
		System.out.println("Array List elements inserted normally:"+al);
		al.add(1,"Prabha");
		al.add(3,"Divya");
		System.out.println("ArrayList elements inserted based on index:"+al);
		al.remove("Divya");
		System.out.println("Array List element removed based on element:"+al);
		al.remove(1);
		System.out.println("Array List element removed based on their index:"+al);
	}
}
