package com.prithvi.spring;

import java.util.ArrayList;

public class BankAccountBean {
	
	ArrayList<String> list;
	String name;
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	public BankAccountBean(){
		list = new ArrayList<String>();
		list.add("Saving");
		list.add("Checking");
		list.add("Credit");
		
	}
}
