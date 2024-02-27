package com.string;

import java.util.Scanner;

public class CompareToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       System.out.println("enter the string1: ");
       String str1=s.next();
       System.out.println("enter the string2: ");
       String str2=s.next();
       System.out.println("enter the string3: ");
       String str3=s.next();
       System.out.println(str1.compareTo(str2));
       System.out.println(str1.compareTo(str3));
       System.out.println(str2.compareTo(str3));
       
       
       
	}

}
