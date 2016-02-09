package com.prithvi.assignment1;

public class PrintASCII {

	public static void main(String [] args){
		int i ;
		char ch;
		for(i = 0; i<=255;i++){
			ch = (char) i;
			System.out.print(i + " : "+ch + "\t");
		}	
	}
	
}