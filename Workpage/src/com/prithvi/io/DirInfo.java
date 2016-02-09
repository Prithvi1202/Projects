package com.prithvi.io;

import java.awt.List;
import java.io.*;
 class DirExtension {

	public boolean accept(File file, String name){
		return name.endsWith(".java");
	}
	
	
}
 public class DirInfo{
	DirInfo(){
		File f = new File("f://marlabs");
		
		DirExtension d = new DirExtension();
		String arr[] = f.list();
		for(int i = 0; i< arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		
	}

}