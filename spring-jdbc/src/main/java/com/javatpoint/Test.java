package com.javatpoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_mysql.xml");
		
		EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");
		
		int status=dao.saveEmployee(new Employee(110,"Sean",22000));
		System.out.println(status);
		
		status=dao.saveEmployee(new Employee(103,"ABC",1122.23f));
		System.out.println(status);
		
		status=dao.saveEmployee(new Employee(104,"Raj",23456));
		System.out.println(status);
		
		status=dao.updateEmployee(new Employee(102,"Sonoo",15000));
		System.out.println(status);
		
		
		Employee e=new Employee();
		e.setId(110);
		int st = dao.deleteEmployee(e);
		System.out.println(st);
		
	}

}
