package com.edubridge.decisionmaking;

import java.util.Scanner;

public class whileTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

System.out.println("enter number to the print:");

int number = s.nextInt();

int i=1;

while(i<=10)
{
	System.out.println(number+"x"+i+"="+number*i);
	i++;
}

	}

}
