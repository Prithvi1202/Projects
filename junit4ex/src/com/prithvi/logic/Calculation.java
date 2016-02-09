package com.prithvi.logic;

import java.util.StringTokenizer;

public class Calculation {
	
	public static int findMax(int a[]){
		int max = a[0];
		for(int i =1; i<a.length; i++){
			if(max < a[i])
				max=a[i];
		}
		return max;
	}
	
	public static int cube(int n){
		return n*n*n;
	}
	public static String reverseWord(String str){
		StringBuilder result = new StringBuilder();
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		while(tokenizer.hasMoreTokens()){
			StringBuilder sb = new StringBuilder();
			sb.append(tokenizer.nextToken());
			sb.reverse();
			
			result.append(sb);
			result.append(" ");
			
		}
		return result.toString();
	}
}
