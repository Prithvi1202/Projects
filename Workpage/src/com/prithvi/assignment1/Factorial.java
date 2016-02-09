package com.prithvi.assignment1;

import java.util.Scanner;

class Factorial{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		
		int s = sc.nextInt();
		if(s<0){
			System.out.println("please enter +ve number.");
			System.exit(0);
		}
		
		System.out.print("Factorial of " + s + " is : ");
		Factorial f = new Factorial();
		f.printFact(s);
	}
	public void printFact(int i){
		if(i <= 1)
			System.out.print("1");
		else{
			System.out.print(i +" X ");
			printFact(i-1);
		}
		
	}
}