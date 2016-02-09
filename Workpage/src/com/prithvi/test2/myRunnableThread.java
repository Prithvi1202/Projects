package com.prithvi.test2;

public class myRunnableThread implements Runnable {
		static String newString;
		@Override
		public void run() {
			
			String OurString = "Hello Java!";
			int n = OurString.length();
			
			System.out.println(OurString);
			
			for(int i = 0;i<n;i++){
				try {
				    Thread.sleep(1000);                
				} catch(InterruptedException ex) {
				    Thread.currentThread().interrupt();
				}
				OurString = DropChar(OurString);	
				
			}
		}
		
		
		public static String DropChar(String s1){
			
			newString = deleteCharAt(s1,0);
			System.out.println(newString); 
			return newString;
		}
		
		public static String deleteCharAt(String s, int pos) {
		      return s.substring(0, pos) + s.substring(pos + 1);
		   }
		
	}
	

