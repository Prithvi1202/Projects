package com.prithvi.assignment1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(){
		System.out.println("Error occured while transfering amount. Insufficient fund! ");
	}
}

public class MiniBankConsoleApp {
 
    private static Properties prop = null;
    static int balance = 0;
   
    public MiniBankConsoleApp(){
        
        try {
            prop = new Properties();
            InputStream is = this.getClass().getResourceAsStream("/userinfo.properties");
            prop.load(is);
            balance = Integer.parseInt(prop.getProperty("balance"));
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        catch (IOException e) {
            e.printStackTrace();
        }
      
    }
    
    public String getvalue(String s){
		String temp = prop.getProperty(s);
    	return temp;
    	
    }
    private void fundTransfer(int amount) throws InsufficientBalanceException {
		if(balance >= amount)
			{
				balance -= amount;
				System.out.println("Available balance is :" +balance);
			}
		else 
		{
			throw new InsufficientBalanceException();
		}
	}

	private void viewBalance() {
		System.out.println(balance);
		
	}
	private void updateBalance(){
		String data = "" + balance;
		prop.setProperty("balance", data);
	}
    
    public static void main(String [] args){
    	MiniBankConsoleApp mp = new MiniBankConsoleApp();
    	Boolean flag = true;
    	Scanner scan = null;
    	while(flag){
    		System.out.println("Please Enter Login Credientials");

    		System.out.println("Name");
    		scan = new Scanner(System.in);
    		String uName = scan.nextLine();

    		System.out.println("Password");

    		scan = new Scanner(System.in);
    		String passCode = scan.nextLine();

    		if(uName.equals(mp.getvalue("username")) && passCode.equals(mp.getvalue("password")) )
    		{
    			System.out.println("Login");
    			flag = false;
    		}
    		else{
    			System.out.println("Login Failed");
    		}
    	}
    	flag = true;
    	while(flag){
    		System.out.println("1. View Balance");
    		System.out.println("2. Fund Transfer");
    		System.out.println("3. Exit");
    		
    		System.out.println("Press 1 to see your account Balance. Press 2 to transfer funds. Press 3 to exit. ");

    		int i = Integer.parseInt(scan.nextLine());

    		switch(i){
    		case 1: 
    			mp.viewBalance();
    			//flag = false;
    			break;
    		case 2:
    			System.out.println("Enter amount to transfer: ");
    			int amount = Integer.parseInt(scan.nextLine());
    			try {
					mp.fundTransfer(amount);
					//flag = false;
				} 
    			catch (InsufficientBalanceException e) {
    				//e.printStackTrace();
				}
    			
    			break;
    		case 3:
    			mp.updateBalance();
    			System.out.println("Thank you for using our application");
    			flag = false;
    			break;
    		default:
    			System.out.println("Enter Valid Option.");

    		}
    	}
    }

	
    
     
}
