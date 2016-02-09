package com.prithvi.assignment1;

class SimpleSingleton{
	private static SimpleSingleton instance = null;
	static int i = 0;
	
	private SimpleSingleton(){
		//instance = factorymethod();
	}
	public static SimpleSingleton factorymethod(){
		if(instance == null){
			instance = new SimpleSingleton();
			System.out.println(++i);
			return instance;
		}
		return null;
	}
	
	public void display(){
		System.out.println("This is display method of singleton");
		
	}

}

public class SimpleSingletonTest{

	public static void main(String [] args){
		//SimpleSingleton singleInstance;
		SimpleSingleton s = SimpleSingleton.factorymethod();
		s.display();
		SimpleSingleton s2 = SimpleSingleton.factorymethod();
		//s2.display();
	}
}