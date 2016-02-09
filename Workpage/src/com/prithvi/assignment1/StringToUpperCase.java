package com.prithvi.assignment1;
import java.util.Scanner;
class StringToUpperCase{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String ");
		StringBuffer s = new StringBuffer(scan.nextLine());
		
		for(int i = 0; i < s.length(); i++  )
		{
			char c = s.charAt(i);
			if(Character.isLowerCase(c))
				c -= 32;
			s.deleteCharAt(i);
			s.insert(i, c);
		}
		
		System.out.println("String is " + s);
	}
}