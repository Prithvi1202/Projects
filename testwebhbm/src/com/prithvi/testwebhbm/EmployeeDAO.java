package com.prithvi.testwebhbm;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

	public static int register(Employee emp){
		  int i=0;
			Session session=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
			
			Transaction t=session.beginTransaction();
							
			i=(Integer)session.save(emp);
					
			t.commit();
			session.close();
			return i;
	}
}
