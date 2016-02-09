/**
 * 
 */
package com.prithvi.bookservice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author Prithvi
 *
 */
public class BookService {
	
	Connection con;
	
	public BookService() {
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/test",
							"root","root");
			
		} catch(Exception e) {
			
		}
	}
	
	public ArrayList<String> retrieveBooks() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		try{
			ResultSet rs = con.createStatement().executeQuery
					("select id from book");
			while(rs.next()) {
				list.add(rs.getString(1));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}

	public String getBookData(String id){
		String data = "";
		try{
			PreparedStatement ps = con.prepareStatement("select * from book where id = ?");
			ps.setInt(1, Integer.parseInt(id));
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				data = data + rs.getString(2) + " , " + rs.getString(3);
				
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return data;
	}
}
