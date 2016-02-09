package com.prithvi.bookservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class BookService {

	int id;
	String title;
	String author;
	

	Connection con;
	Statement st;
	public BookService() {
		// TODO Auto-generated constructor stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test" , "root" , "root");
			st = con.createStatement();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBookInfo(){
		return id + " & " +title;
	}
	
	public int insert(){
		int x = 0;
		try{
			PreparedStatement ps = con.prepareStatement("insert into Book(id,title,author) values(?,?,?) ");
			ps.setInt(1, id);
			ps.setString(2, title);
			ps.setString(3, author);
			x = ps.executeUpdate();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return x;
	}
	
}
