package com.edubridge.datatype;
import java.util.Scanner;
public class ScannerArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s= new Scanner(System.in);
   System.out.println("enter the value of a:");
   System.out.println("enter the value of b:");
     int a = s.nextInt();
     int b =s.nextInt();
    
     System.out.println(a+b);
     System.out.println(a-b);
     System.out.println(a*b);
     System.out.println(a/b);
     System.out.println(a%b);
	}

}
