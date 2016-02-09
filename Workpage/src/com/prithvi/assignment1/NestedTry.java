package com.prithvi.assignment1;

class NestedTry{
	public static void main(String [] args){
		int i = 20, j = 0, k = 0;
		try{
			/*int a[] = {1,2,3,4,5};
			System.out.println(a[5]);*/
			try{
				k = i/j;
				System.out.println(k);
			}
			catch(ArithmeticException ex){
				System.out.println("Arithmetic" + ex);
				ex.printStackTrace();
			}
			int a[] = {1,2,3,4,5};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Array");
			ex.printStackTrace();
		}
		catch(Exception ex){
			System.out.println("Exception");
			ex.printStackTrace();
		}
	
	}

}