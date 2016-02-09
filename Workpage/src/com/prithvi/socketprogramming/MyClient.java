package com.prithvi.socketprogramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	
	public static void main(String a[]){
		Socket socket;
		try {
			socket = new Socket("172.17.30.35", 1234);
		
		InputStream in = socket.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		String str = dis.readUTF();
		System.out.println("From server: " +str);
		dis.close();
		in.close();
		socket.close();
		} 
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
