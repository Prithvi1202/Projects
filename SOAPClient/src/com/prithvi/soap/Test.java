package com.prithvi.soap;

import com.marlabs.soap.HelloImplService;
import com.marlabs.soap.IHello;

public class Test {
	public static void main(String a[]){
		HelloImplService helloWorldService = new HelloImplService();
		IHello helloWorld = helloWorldService.getHelloImplPort();
		System.out.println(helloWorld.helloWorld("Prithvi"));
	}
}
