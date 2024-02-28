package com.oops;
class Student1{
	String name="Rahul"; 
	String address ="Thane";
	String qualification="BE CSE";
}
class Cource extends Student1{
	String cName=" java full stack";
	int fees=5000;
}
class Placement extends Student1{
	String compName="Capgimini";
	String ctc="5lacks";
}
public class HierarchicalInheritanceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cource c1=new Cource();
Placement p1=new Placement();
System.out.println("studenr name:"+c1.name+"\nstudent Name:"+c1.address+"\nstudent qualification:"+c1.qualification+"\n Cource name:"+c1.cName+"\n cource fee:"+c1.fees+"\n company name :"+p1.compName+"\n your ctc:"+p1.ctc);
	}

}
