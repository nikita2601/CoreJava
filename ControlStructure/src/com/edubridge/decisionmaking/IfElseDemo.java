package com.edubridge.decisionmaking;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=18 && weight>=45)
		{
			System.out.println("eligible to donate the blood");
		}
		else
		{
		System.out.println("not eligible");
		}
		s.close();
	}

}
