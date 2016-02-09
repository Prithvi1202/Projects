package com.prithvi.soap;

import javax.jws.WebService;

@WebService(endpointInterface = "com.prithvi.soap.IHello")
public class HelloImpl implements IHello {

	public String helloWorld(String name) {
		return "Hello world from " + name;
	}

}
