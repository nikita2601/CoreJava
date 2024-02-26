package com.edubridge.operators;

import java.util.Scanner;

public class TernaryOperatoreDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s= new Scanner(System.in);
 int num=s.nextInt();
 String res=(num%2==0)? "Even":"Odd";
 System.out.println(res);
	}

}
