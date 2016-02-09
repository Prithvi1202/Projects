package com.team5.productmodule;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspWriter;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ShoppingCart {


	public static ArrayList<Product> itemlist = new ArrayList<Product>();  // list of Items in the cart
	public static ArrayList<ProductWishList> itemwishlist = new ArrayList<ProductWishList>();
	
	public static java.text.DecimalFormat currency = new java.text.DecimalFormat("$ #,###,##0.00");

	public ShoppingCart()
	{

	}
	public void empty()
	{
		itemlist.clear();
	}

	public static int add(Product anitem){

		int j=0;
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Transaction t=session.beginTransaction();

		

		for(int i = 0; i < itemlist.size(); i++)
		{
			Product item = itemlist.get(i);
			if(anitem.id == item.id) 
			{
				item.quantity += anitem.quantity; 
				j++;
				t.commit();
				session.close();
				return j;
			}
		}

		itemlist.add(anitem); 


		j++;
		t.commit();
		session.close();
		return j;
	}
	public static int addToCart(Product anitem){

		int j=0;
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Transaction t=session.beginTransaction();

		j=(Integer)session.save(anitem);

		for(int i = 0; i < itemlist.size(); i++)
		{
			Product item = itemlist.get(i);
			if(anitem.id == item.id) 
			{
				item.quantity += anitem.quantity; 
				j++;
				t.commit();
				session.close();
				return j;
			}
		}

		itemlist.add(anitem); 


		j++;
		t.commit();
		session.close();
		return j;
	}

	public static int addToWishList(ProductWishList anitem){

		int j=0;
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Transaction t=session.beginTransaction();

		j=(Integer)session.save(anitem);

		for(int i = 0; i < itemwishlist.size(); i++)
		{
			ProductWishList item = itemwishlist.get(i);
			if(anitem.id == item.id) 
			{
				item.quantity += anitem.quantity; 
				j++;
				t.commit();
				session.close();
				return j;
			}
		}

		itemwishlist.add(anitem); 


		j++;
		t.commit();
		session.close();
		return j;
	}
	public static void remove(int id)
	{
	



		for(int i = 0; i < itemlist.size(); i++)
		{
			Product item = itemlist.get(i);
			if(id == item.id) // item in the cart?
			{
				itemlist.remove(i); // remove it
				break;
			}
		}
		
		

	}
	public static void removeCart(int id)
	{
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Transaction t=session.beginTransaction();

		Product product = new Product();
		product.setId(id);
		session.delete(product);
		
		for(int i = 0; i < itemlist.size(); i++)
		{
			Product item = itemlist.get(i);
			if(id == item.id) // item in the cart?
			{
				itemlist.remove(i); // remove it
				break;
			}
		}
		t.commit();
		session.close();
	}
	public static void removeWishList(int id)
	{
		Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();

		Transaction t=session.beginTransaction();

		ProductWishList product = new ProductWishList();
		product.setId(id);
		session.delete(product);
		
		for(int i = 0; i < itemwishlist.size(); i++)
		{
			ProductWishList item = itemwishlist.get(i);
			if(id == item.id) // item in the cart?
			{
				itemwishlist.remove(i); // remove it
				break;
			}
		}
		t.commit();
		session.close();
	}

	public static List<ProductWishList> displayWishList(String userId) throws IOException
	{
		List<ProductWishList> list = new ArrayList<ProductWishList>();
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx = null;       
		
		try {
			tx = session.getTransaction();
			tx.begin();
			
			list = session.createQuery("from ProductWishList where userid = :userId").setString("userId", userId).list();                       
			

			tx.commit();
			
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}

		return list;
/*		out.println("<h3>Cart contents</h3>");
		out.println("<table border=1>");
		out.println("<tr><th>ID</th><th>Name</th><th>Price</th><th>Quantity</th><th>Total</th></tr>");

		double total = 0;
		//
		// output one item at a time from the cart, one item to a row table
		//
		for(int i = 0; i < itemlist.size(); i++)
		{
			Product item = (Product)itemlist.get(i);
			out.println("<tr><td>"+item.name+"</td>"+
					"<td align=right>"+ currency.format(item.price)+"</td>"+
					"<td align=right>"+ item.quantity+"</td>"+
					"<td align=right>"+ currency.format(item.price*item.quantity)+"</td>"+
					"<td align=center><A href='removeItemFromCart.jsp?id="+item.id+"'>remove</A></TD></tr>");
			total += item.price*item.quantity;
		}
		//
		// add summary information (total, tax, grand total)
		//
		out.println("<tr><td colspan = 4>Total purchase</td>");
		out.println("<td align=right>"+currency.format(total)+"</td></tr>");

		out.println("<a href='#'><input type='Button' value='Check Out'/></A><br/>");
*/
	}
	
	public static List<Product> displayCart(String userId) throws IOException
	{
		List<Product> list = new ArrayList<Product>();
		Session session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx = null;       
		try {
			tx = session.getTransaction();
			tx.begin();
			list = session.createQuery("from Product where userid = :userId").setString("userId", userId).list();                       
			

			tx.commit();
			
		} catch (Exception e) {
			if (tx != null) {
				tx.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}

		return list;
	}
	public static List<Product> display() throws IOException
	{

		return itemlist;
	}		
	
	
}

