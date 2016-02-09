package com.prithvi.GUI;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class EmployeeManagement  {

	public static void main(String [] args){
		Employee firstEmployee = new Employee(1, "Sheela", 100000);
		System.out.println(firstEmployee);
		
		FileOutputStream fos = null;
		ObjectOutputStream os = null;
		try {
			fos = new FileOutputStream("temp.txt");
			 os = new ObjectOutputStream(fos);
			os.writeObject(firstEmployee);
			System.out.println("Employee saved!! ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try{
				os.close();
				fos.close();
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
	}
	
}
 