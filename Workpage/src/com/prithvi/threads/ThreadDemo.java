package com.prithvi.threads;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myRunnableThread r = new myRunnableThread();
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i<10;i++){
			System.out.println("main Thread");
		}
	}

}
