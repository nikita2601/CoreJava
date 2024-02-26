package com.edubridge.datatype;

public class Global_Variable {
	String ename="Jhon";
	void Info () {
		int empid = 101;
		System.out.println(ename+""+empid);
	
	}
	void Info2 () {
		String empdesignation =" Java developer";
		System.out.println(ename+" "+empdesignation);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Global_Variable g1=new Global_Variable();
 g1.Info();
 g1.Info2();
	}

}
