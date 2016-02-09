package com.prithvi.io;
import java.io.*;
class myFileNameFilter{
	public static void main(String [] args){
		
		File file = new File("f://Marlabs");

		FilenameFilter filter = new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				String lowercaseName = name.toLowerCase();
				if (lowercaseName.endsWith(".java")) {
					return true;
				} else {
					return false;
				}
			}
		};
		
		String files[] = file.list(filter);
		System.out.println("Java files are:");
		System.out.println("---------------");
		for(int i = 0 ; i< files.length; i++){			
			System.out.println(files[i]);
		}
	}
}
