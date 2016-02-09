package com.prithvi.rmiclient;

import java.rmi.Naming;

import com.prithvi.rmi.HelloRemote;



public class Test {
	public static void main(String a[]){
		try{
			HelloRemote remote = (HelloRemote) Naming.lookup("rmi://localhost:7780/helloApp");
			System.out.println("CLient Established!");
			System.out.println(remote.sayHello("Prithvi"));
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
