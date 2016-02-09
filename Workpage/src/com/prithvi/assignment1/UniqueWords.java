package com.prithvi.assignment1;

import java.util.*;
class UniqueWords{
	static char separator = ' ';
	static String input = "Aankhon ke panno pe , Maine likha tha sau dafa , Lafzon mein jo ishq tha , Hua woh honton se bayaan , Khud se naraz hun , Kyun be-awaaz hun , Meri khamoshiyan hain saza , Ke main hoon hero tera , Ke main hoon hero tera";
	public static void main(String [] args){
		UniqueWords uw = new UniqueWords();
		 ArrayList<String> data= uw.split(input);
		 HashMap<String, Integer> hm=new HashMap();
		//Collections.
		 for(int i=0;i<data.size();i++){
			 if(hm.containsKey(data.get(i))){
				 hm.put(data.get(i), hm.get(data.get(i))+1);
			 }
			 else{
				 hm.put(data.get(i),1);
			 }	 
		 }
		 for (String stringvalue: hm.keySet()){

	            String key =stringvalue.toString();
	            String value = hm.get(stringvalue).toString();  
	            System.out.println(key + " " + value);  

		 } 
	}
	
	public ArrayList<String> split(String s){
		
		ArrayList<String> data=new ArrayList<String>();
		ArrayList<Character> substring = new ArrayList<Character>();
		
		for(int i = 0; i < s.length(); i++){
			if(s.charAt(i) != separator){
				substring.add(s.charAt(i));
			}
			else{
				StringBuilder result = new StringBuilder();
				for(Character c: substring){
					result.append(c);
				}
				
				data.add(result.toString());
				substring.clear();
				
			}
		}
		return data;
	}
	
}