package com.prithvi.GUI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;


public class ReadEmployee {
	public static void main(String [] args){
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("temp.txt");
			ois = new ObjectInputStream(fis);
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				ois.close();
				fis.close();

			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}

