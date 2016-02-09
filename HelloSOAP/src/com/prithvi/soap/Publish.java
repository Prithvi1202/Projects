package com.prithvi.soap;

import javax.xml.ws.Endpoint;

public class Publish {
	
	public static void main(String a[]) {
		
		Endpoint.publish("http://localhost:2345/WS/HelloWorld",new HelloImpl());
		System.out.println("Published!");
		
	}

}
