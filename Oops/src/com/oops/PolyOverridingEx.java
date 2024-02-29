package com.oops;
class Employee{
	void show(String name) {
		System.out.println("Employee Name:"+name);
	}
}
class Company{
	void show(String name) {
		System.out.println("Company name:"+name);
	}
}


public class PolyOverridingEx {
	public static void main(String args[])
{
	Employee e1=new Employee();
	
	e1.show("john smith");
	Company c1=new Company();
	c1.show("Capgimini");
	
}
}
