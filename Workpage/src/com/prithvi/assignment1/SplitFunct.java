package com.prithvi.assignment1;
import java.util.ArrayList;
class SplitFunct{
	
	static Character separator = ',';
	public static void main(String [] args){
		String input = "Java,C#,Python,Ruby,VB";
		SplitFunct sf = new SplitFunct();
		sf.split(input);
	}
	
	void split(String s){
		
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
				System.out.println(result.toString());
				substring.clear();
			}
		}
	}
}