package com.team5.productmodule;

public class ProductWishList {

	public int id;
	public	String name;
	public int price;
	public int quantity;
	public String userid;
	
	/**
	 * @return the userid
	 */
	public String getUserid() {
		return userid;
	}
	/**
	 * @param userid the userid to set
	 */
	public void setUserid(String userid) {
		this.userid = userid;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the itemName
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setname(String itemName) {
		this.name = itemName;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	} 
	
	public String toString(){
		String data = "Name: " + name +"Price: "+price+ "Quantity: " +quantity;
		return data;
		
	}
}
