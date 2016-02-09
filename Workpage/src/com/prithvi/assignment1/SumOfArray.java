package com.prithvi.assignment1;
import java.util.Scanner;
class SumOfArray{
	public static void main(String [] args){
		
		int []arr = new int[5];
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array");
		for(int i = 0; i<5 ; i++){
			arr[i] = scan.nextInt();
		}
		for(int i = 0; i<arr.length;i++){
			sum += arr[i];
		}
		System.out.println("Sum of array elements is :"+sum);
	}
}