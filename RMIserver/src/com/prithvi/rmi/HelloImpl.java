package com.prithvi.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class HelloImpl extends UnicastRemoteObject implements HelloRemote{
	
	public HelloImpl() throws RemoteException{
		super();
	}
	@Override
	public String sayHello(String name){
		return "Hello" + name+"@"+ new Date().toString();
	}
	public static void main(String a[]){
		try {
			Registry registry = LocateRegistry.createRegistry(7780);
			HelloImpl obj = new HelloImpl();
			registry.rebind("helloApp", obj);
			System.out.println("The server app is initialized. ");
		
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
