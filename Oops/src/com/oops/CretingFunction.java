package com.oops;
class Student{
	String name;
	int age;
	void disp(String n,int a) {
		name=n;
		age=a;
		System.out.println("Student name:"+name+"\nStudent age:"+age);
	}
}
public class CretingFunction {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		s1.disp("jhon", 23);
		s1.disp("sam", 33);
	}

}
