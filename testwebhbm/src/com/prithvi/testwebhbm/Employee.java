/**
 * 
 */
package com.prithvi.testwebhbm;

/**
 * @author Prithvi
 *
 */
public class Employee {
	int eid;
	String name;
	double salary;
	int age;
	/**
	 * @return the eid
	 */
	public Employee(){
		
	}
	public Employee(int eid, String name, double salary, int age){
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}
	public int getEid() {
		return eid;
	}
	/**
	 * @param eid the eid to set
	 */
	public void setEid(int eid) {
		this.eid = eid;
	}
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
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
