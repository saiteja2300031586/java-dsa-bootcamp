package day4strings;

import java.util.ArrayList;
import java.util.LinkedList;


public class CollectionsDemo {
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<>();
		al.add("JAVA");
		al.add("DSA");
		al.add("MAVEN");
		al.remove("DSA");
		System.out.println("ArrayList :" +al);
		
		LinkedList<String>ll=new LinkedList<>();
	ll.add("Arrays");
	ll.add("Strings");
	ll.addFirst("HashMap");
	ll.removeFirst();
	System.out.println("LinkedList :" +ll);
	
	System.out.println("Iterating : ");
	for(String s : al) {
		System.out.println(s);
	}
	}
}
