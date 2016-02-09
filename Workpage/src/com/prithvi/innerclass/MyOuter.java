package com.prithvi.innerclass;

public class MyOuter {

	private static int x= 10;
	public static void main(String []a){
		MyOuter outer = new MyOuter();
	MyOuter.MyInner inner = outer.new MyInner();
		inner.go();
		System.out.println(" Outer class after calling method of inner class: " + x);
	
	}
	class MyInner {
		
		void go(){
			x = 42;
			System.out.println("Inner class assigned value to " + x);
		}
	}
	
	
}
