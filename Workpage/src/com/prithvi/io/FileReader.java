package com.prithvi.io;
import java.io.*;

class FileReader{

	BufferedReader br;
	FileOutputStream fos;	
	FileInputStream fis;
	int i;
	FileReader(){
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			fos = new FileOutputStream("temp.txt");
			System.out.println("Enter text(x to Exit)");
			while((i = br.read()) != 'x'){
				fos.write(i);
			
			}
			fis = new FileInputStream("temp.txt");
			
			System.out.println("Reading from file");
			while((i = fis.read()) != -1){
				System.out.print((char)i);
			}
		}
		catch(IOException e){
			
		}
		finally{
			try{
					fos.close();
					br.close();
			}
			catch(IOException e){}
		}
	}
	public static void main(String [] args){
			new FileReader();
			
		}
}