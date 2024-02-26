package com.edubridge.decisionmaking;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Welcome to Employee Management System");
int choice=0;
do {
	System.out.println("1.Employee has to enter name");
	System.out.println("2.enter designation:");
	System.out.println("3.enter specialization:");
	System.out.println("4.exit");
	Scanner s =new Scanner(System.in);
	choice=s.nextInt();
	switch(choice) {
	case 1:
		System.out.println("enter name:");
		String name= s.next();
		System.out.println("Employee Name:"+name);
		break;
	case 2:
		System.out.println("enter designation:");
		String designation= s.next();
		System.out.println("Employee designation:"+designation);
		break;
	case 3:
		System.out.println("enter specailization:");
		String specailization = s.next();
		System.out.println("Employee specailization:"+specailization);
		break;
	case 4:
		System.out.println("Exit");
    default:
			System.out.println("wrong Input!");
			break;
	}
	
	
}while(choice!=4);


	}

}
