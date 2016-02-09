/**
 * 
 */
package com.prithvi.testhbm;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author Prithvi
 *
 */
public class TestEmp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating configuration object
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
		
		//creating session factory object
		SessionFactory factory=cfg.buildSessionFactory();
		
		//creating session object
		Session session=factory.openSession();
		
		//creating transaction object
		Transaction t=session.beginTransaction();
			
		Employee e1= new Employee();
		e1.setEid(12);
		e1.setName("Shravan");
		e1.setSalary(34232.32);
		e1.setAge(19);
		session.persist(e1);
		
		//session.saveOrUpdate(e1);
		Employee e2 = new Employee(12, "Prithvi" , 70000, 23);
		session.save(e2);
		t.commit();//transaction is commited
		session.close();
		
		System.out.println("successfully saved");
		
		
	}

}
