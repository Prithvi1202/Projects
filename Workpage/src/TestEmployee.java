
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class Employee {
	String name;
	List<String> address = new ArrayList<>();
	String Designation;
	
	Employee e;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAddress(String addr){
		this.address.add(addr);
	}
	public List<String> getAddress(){
		return address;
	}
	
	public void setDesignation(String Des){
		Designation = Des;
	}
	public String getDesignation(){
		return Designation;
	}
	public void setEmployee(Employee e){
		this.e = e;
	
	}
	public Employee getEmployee(){
		return e;
	}
	
	
	public String toString(){
		String data = "Name: " + name + " Designation: "+Designation + e.name;
		for (int i = 0; i < address.size(); i++) {
			data = data + " "+address.get(i);
		}
		
		
		return data;
				
	}
}

public class TestEmployee {
	public static void main(String [] args){
		Employee e1 = new Employee();
		e1.setDesignation("Developer");
		e1.setName("ABC");
		e1.setAddress("USA");
		e1.setAddress("India");
		System.out.println(e1);
	
		Employee e2 = new Employee();
		e2.setDesignation("Manager");
		e2.setName("XYZ");
		e2.setAddress("Nepal");
		e2.setEmployee(e1);
		e2.setAddress("India");
		
		System.out.println(e2);
	}

}