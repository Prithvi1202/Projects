package com.prithvi.test2;

import com.prithvi.test2.myRunnableThread;

public class DropCharacters{
	
	public static void main(String [] args){
		myRunnableThread r = new myRunnableThread();
		Thread t = new Thread(r);
		t.start();
		/*try {
		    Thread.sleep(1000);                
		} catch(InterruptedException ex) {
		    Thread.currentThread().interrupt();
		}*/
	}

	
	
}
