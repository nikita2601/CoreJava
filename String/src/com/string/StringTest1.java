package com.string;

import java.util.Scanner;

public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="jhon";
		System.out.println(name);
		//By object
		String s=new String("Good Evening");
		System.out.println(s);
		//by variable
		char ch[]= {'M','U','M','B','A','I'};
		//convert character array into string
		String s1=new String(ch);
		System.out.println(s1);
		System.out.println("Size of string:"+s1.length());
		String fname="nikita";
		String lname="rajput";
		System.out.println(fname+lname);
		//equals method
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Username:");
		String uname=sc.next();
		System.out.println("enter Password:");
		String password=sc.next();
		if(uname.equals("admin")&&password.equals("admin"))
		{
			System.out.println("u can login");
		}
		else
		{
			System.out.println("wrong credientials");
		}
	}

}
