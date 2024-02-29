package com.oops;
class Members{
	String name;
	int age;
	String address;
	String phno;
	int salary=25000;
	void printSalary() {
		System.out.println("Salary of members is:"+salary);
	}
}
class Employee1 extends Members{
	String specialization="Jr Java Developer";
	
	
	
}
class Manager1 extends Members{
	String department="IT";
}
public class Assignment1 {

	public static void main(String[] args) {
		Employee1 e1=new Employee1();
		e1.name="jhon";
		Manager1 m1=new Manager1();
		m1.name="rohit";
		System.out.println("Name of employee:"+e1.name+"\nEmployee Specialiaztion:"+e1.specialization);
		
		System.out.println("Name of Manager:"+m1.name+"\nManager Department:"+m1.department);
		
		e1.printSalary();
		
		

	}

}
