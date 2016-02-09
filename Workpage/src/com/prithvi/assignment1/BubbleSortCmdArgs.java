package com.prithvi.assignment1;

public class BubbleSortCmdArgs {

	public static void main(String []args){
		int arr[] = new int[args.length];
		int temp;
		for(int i = 0 ; i<args.length;i++){
			arr[i] = Integer.parseInt(args[i]);
		}
		for(int i = 0 ; i<arr.length;i++){
			if(arr[i] > arr[i+1]){
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		for(int i = 0 ; i<arr.length;i++){
			System.out.print("Sorted array is : "+arr[i]+ " ");
		}
		
	}
}
