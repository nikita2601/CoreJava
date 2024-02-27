package com.oops;

import java.util.Scanner;

class user{
	String name;
	int age;
	int numberoffamily;
	void dips(String s,int n,int m)
	{
		name=s;
		age=n;
		numberoffamily=m;
		System.out.println("Student name:"+name+"\nStudent age:"+age+ "\n number of family:"+numberoffamily);

		
	}
}
public class UserInputClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		user u=new user();
		Scanner s1=new Scanner(System.in);
		
		System.out.println("enter the name:");
		String name = s1.next();
		
		System.out.println("enter the age:");
		int age=s1.nextInt();
		
		System.out.println("enter the family memeber:");
		int numberoffamily=s1.nextInt();
		System.out.println("");
		u.dips(name, numberoffamily, numberoffamily);
		
	}

	

}
