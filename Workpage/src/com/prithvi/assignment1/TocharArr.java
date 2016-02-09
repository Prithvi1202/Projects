package com.prithvi.assignment1;

class TocharArr{
	public static void main(String [] args){
		
		String input = "ToCharArrayToString";	
		int n = input.length();
		char arr[] = new char[n];
		 for(int i = 0; i< n;i++){
			 arr[i] = (char)(input.charAt(i));
		 }
		 
		 for(int i = 0; i< n;i++) {
			 System.out.print(arr[i]+ " ");
		 }
	}
}