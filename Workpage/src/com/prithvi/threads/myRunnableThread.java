package com.prithvi.threads;

public class myRunnableThread implements Runnable {

	@Override
	public void run() {
		for(int i= 0 ; i < 10;i++){
			System.out.println("Child Thread");
		}
		
	}
	
}
