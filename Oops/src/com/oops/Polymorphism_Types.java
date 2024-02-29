package com.oops;
class Maths{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	void add(String a, int b) {
		System.out.println(a+b);
	}
}
public class Polymorphism_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths m1=new Maths();
		m1.add(10, 20);
		m1.add("hello", 12);
		m1.add(12, 45, 45);

	}

}
