package com.edubridge.datatype;

public class Instance_Variable
{
int id = 101;
static int i=500;
static String name="neha";

void disp() {
	String Company_Name="TCS";//local variable//
	System.out.println(Company_Name);
}
void show() {
		System.out.println(id);
		
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_Variable v1=new Instance_Variable();
v1.disp();
v1.show();
System.out.println(Instance_Variable.i);
System.out.println(Instance_Variable.name);

	}

}
