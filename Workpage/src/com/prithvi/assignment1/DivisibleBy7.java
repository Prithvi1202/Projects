package com.prithvi.assignment1;
class DivisibleBy7{
	public static void main(String [] args){
		int count=0;
		for(int i = 1; i<=500; i++){
			if(i%7 == 0)
				count++; 
		}
		System.out.println(count);
		System.out.println(500/7);
	}
}