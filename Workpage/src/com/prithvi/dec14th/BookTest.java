package com.prithvi.dec14th;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



class Book{
	/*static int number = 1;
	int no = 0;*/
	String bookName;
	String autherName;
	int iSBN;

	
	public Book(String bookName, String autherName, int iSBN) {
		super();
		
		this.bookName = bookName;
		this.autherName = autherName;
		this.iSBN = iSBN;
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

	public int getISBN() {
		return iSBN;
	}

	public void setISBN(int iSBN) {
		iSBN = iSBN;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String toString(){
		//no = number++;
		String detail = "\nBook: " + bookName + " \nAuther Name: " +autherName + " \nISBN: "+ iSBN;
		return detail;
	}
}

class BookManager{
	
	Set<Book> books = new HashSet<Book>();
	Book b;
	Iterator<Book> it;
	public void insertBook(String name, String autherName, int iSBN){
		b = new Book(name, autherName, iSBN);
		books.add(b);
	}
	public void retriveAllBooks(){
		/*it = books.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			
		}*/
		for(Book b1 : books){
			System.out.println(b1);
		}
	}
	
	public void deleteBook(String bookName){
		
		for(Book b1 : books){
			if(b1.getBookName() == bookName){
				books.remove(b1);
				break;
			}
			
		}
		
	}
	
	public void search(String bookName){
		for(Book b1 : books)
		{
			if(b1.getBookName() == bookName)
			{
				System.out.println( b1);
			}
			
		}
	}
}
public class BookTest {
	public static void main(String [] args){
		BookManager bm = new BookManager();
		bm.insertBook("p", "p1", 32232);
		bm.insertBook("a2", "df2", 32232);
		bm.insertBook("a1", "df", 34);
		bm.insertBook("java", "p2", 32232);
		
		
		Boolean flag = true;
    	Scanner scan = null;

    	System.out.println("Welcome to Library.!");
    	flag = true;
    	String bookName;
    	String autherName;
    	int iSBN;
    	while(flag){
    		System.out.println("1. Retrive Books");
    		System.out.println("2. Insert Book");
    		System.out.println("3. Delete Book");
    		System.out.println("4. Search Book");
    		System.out.println("5. Exit");
    		
    		//System.out.println("Press 1 to see your account Balance. Press 2 to transfer funds. Press 3 to exit. ");
    		scan = new Scanner(System.in);
    		int i = Integer.parseInt(scan.nextLine());

    		switch(i){
    		case 1: 
    			bm.retriveAllBooks();
    			break;
    		case 2:
    			System.out.println("Enter Book Details: ");
    			System.out.println("Book name: ");
    			scan = new Scanner(System.in);
    			bookName = scan.nextLine();
    			System.out.println("Auther name: ");
    			scan = new Scanner(System.in);
    			autherName = scan.nextLine();
    			System.out.println("ISBN ");
    			scan = new Scanner(System.in);
    			iSBN = Integer.parseInt(scan.nextLine());
    			bm.insertBook(bookName, autherName, iSBN);
    			System.out.println("Book Inserted!");
    			break;
    		case 3:
    			System.out.println("Enter book name to delete.");
    			scan = new Scanner(System.in);
    			bookName = scan.nextLine();
    			bm.deleteBook(bookName);
    			System.out.println("Book Deleted!");
    			break;
    		case 4:
    			System.out.println("Enter book name to Search.");
    			scan = new Scanner(System.in);
    			bookName = scan.nextLine();
    			bm.search(bookName);
    			
    			break;
    		case 5: 
    			System.out.println("Thank you!");
    			flag = false;
    			break;
    		default:
    			System.out.println("Enter Valid Option.");

    		}
    	}

		
		
	}
}