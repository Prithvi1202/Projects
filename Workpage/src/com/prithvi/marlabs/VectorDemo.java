package com.prithvi.marlabs;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("One");
		v.add(2);
		v.add(3.0);
		v.add(new Integer(4));
		
		System.out.println(v);
		System.out.println(v.size() + " : "+ v.capacity());
		
		
		
		//Vector<String> v2 = new Vector<String>();
		//Vector<Book> bookVector = new Vector();
		
		ArrayList a1 = new ArrayList();
		a1.add(100);
		a1.add("Hello");
		Iterator it = a1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//Hashtable
		
		Hashtable table = new Hashtable();
		table.put("one", 100.0);
		table.put("two", 110.0);
		table.put("three", 120.0);
		table.put("four", 130.0);
	
		System.out.println(table.get("four"));
		Enumeration keys = table.keys();
	
		
		while(keys.hasMoreElements()){
			System.out.println(table.get(keys.nextElement().toString()));
		}
	}
}
