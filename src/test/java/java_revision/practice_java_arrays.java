package java_revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class practice_java_arrays {

	public static void main(String args[]) {
		//String s = "iohfmukdzsosd";
		//char[] ch=s.toCharArray();  
		//for(int i=0;i<ch.length;i++){  }
		stringrepeatnumber("I am am a java java developer and want want want a huge package in java only");
		arraylistex();
		hashmapex();
		hashsetex();
		arrayex();
	}
	
// a java interview program.
private static void stringrepeatnumber(String str) {
	// hashmap tayar karun string madhlya sarv values hashmap madhe save karu
	// string array madhale strings one by one hashmap madhe save karave lagatil.
	// direct main string madhlya values obe bye one HashMap madhe save karta yet nahi. 
	HashMap<String, Integer> hm = new HashMap<>();
	String[] s1 = str.split(" ");
	for (String s2 : s1) {
		
		if(hm.get(s2) != null) {
			hm.put(s2, hm.get(s2)+1);
		}
		else {			
		hm.put(s2, 1);
	}}
	//System.out.println(hm);
	Iterator<String> s5 = hm.keySet().iterator();
	while(s5.hasNext()) {
		String s4 = s5.next();
		if(hm.get(s4)>1) {
			System.out.println(s4+" "+hm.get(s4));
		}
	}
}



private static void arraylistex() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("manish");
		al.add("vishal");
		// print the ArrayList
		//----System.out.println(al);
		//print the ArrayList values using the iterator 
		for(String name: al) {
			System.out.println(name);
		}
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(22);
		//adding multiple elements at the end of an ArrayList
		Collections.addAll(al2, 1, 2, 3, 4, 5);
		//----System.out.println(al2);
		// create an ArrayList with adding multiple elements at the time of declaration.		
		List<Integer> al3 = Arrays.asList(5, 12, 9, 3, 15, 88, 5, 7, 32, 45, 15);
		//----System.out.println(al3);
		//strings
		List<String> al4 = Arrays.asList("Suhas", "Pratham", "Vikas");
		//----System.out.println(al4);
		
		// reverse print the ArrayList
		Collections.reverse(al4);
		//----System.out.println(al4);
		Collections.reverse(al3);
		//----System.out.println(al3);
		
		// print an ArrayList from the second element to the third last element
		for(int i=1; i<=al3.size()-3;i++) {
			System.out.print(al3.get(i)+" ");
		}System.out.println();
		// reverse print the ArrayList from third last element to the second element. Easy Now.
}


		public static void hashmapex() {
			   HashMap<Integer,String> hm=new HashMap<Integer,String>();    
			    System.out.println("Initial list of elements: "+hm);  
			      hm.put(100,"Amit");    
			      hm.put(101,"Vijay");    
			      hm.put(102,"Rahul");   
			    //----	      System.out.println(hm);	
			      
			      // reverse print the hashmap using keys		??
			      
		}

		
		public static void hashsetex() {
		    HashSet<String> set=new HashSet();  
	           set.add("One");    
	           set.add("Two");    
	           set.add("Three");   
	           set.add("Four");  
	           set.add("Five");  
	         //----       System.out.println(set);
			      // reverse print
	           for(int i=set.size()-1;i>=0;i--) {
	        	 //---- 	   System.out.println(set);
	           }
	           
	           // gete element by index --->>
	           // Convert HashSet into Array using toArray() method
	           // thus, Access elements by index.

	           
	           }

		
		public static void arrayex() {
			int a[]={33,3,4,5, 9, 13, 43, 32};
			System.out.println(a[1]);
			// print the array
			for(int i=0;i<=a.length-1;i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
			// reverse print the array
			for(int i=(a.length-1);i>=0;i--) {
				System.out.print(a[i]+" ");
			}System.out.println();
			// print an array from the second element to the third last element
			for(int i=1;i<=a.length-3;i++) {
				System.out.print(a[i]+" ");
			}System.out.println();
			// reverse print the array from third last element to the second element
			for(int i=(a.length-3);i>=1;i--) {
				System.out.print(a[i]+" ");
			}System.out.println();	
		}
}














