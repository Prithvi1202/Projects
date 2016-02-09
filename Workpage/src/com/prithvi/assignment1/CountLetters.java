package com.prithvi.assignment1;

import java.util.Scanner;
class CountLetters{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String ");
		String s = scan.nextLine();
		
		int upperCase = 0;
		int lowerCase = 0;
		
		for(int i = 0; i < s.length(); i++  )
		{
			char c = s.charAt(i);
			if(Character.isUpperCase(c))
				upperCase++;
			else if(Character.isLowerCase(c))
				lowerCase++;
				
				//ignores spaces if there is more than one word
		}
		System.out.println("Uppercase letters are : " + upperCase + "\n"+ "Lower Case letters are :" +lowerCase);
	}
}