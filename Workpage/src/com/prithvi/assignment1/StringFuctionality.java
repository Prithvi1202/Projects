package com.prithvi.assignment1;

public class StringFuctionality{
	int count = 0;
	 char a[];
	
	public int length1(String input){
		a = input.toCharArray();
		for(char c : a){
			count++;
		}
		return count;
	}
	public String toUpperCase(String s){

		StringBuffer sf = new StringBuffer(s);
		for(int i = 0; i < length1(s); i++  )
		{
			char c = s.charAt(i);
			if(Character.isLowerCase(c))
				c -= 32;
			sf.deleteCharAt(i);
			sf.insert(i, c);
		}
		return sf.toString();
	}
	public char charAt(String s , int i){
		char data = 0;
		a = s.toCharArray();
		for(int c= 0; c< s.length();c++ ){
			if(c == i){
				 data = a[c];
			}
			
		}
		return data;
	}
	
	
	
	public static void main(String [] args){
		String s = "Prithvi";
		StringFuctionality sf = new StringFuctionality();
		System.out.println("String length :"+ sf.length1(s));
		//System.out.println("String into Upper Case :"+ sf.toUpperCase(s));
		System.out.println("At 3rd index position, we found " + +sf.charAt(s, 3));	
	}
	
}