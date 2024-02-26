package com.edubridge.decisionmaking;

import java.util.Scanner;

public class SwitcharimeticCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     int a =s.nextInt();
     System.out.println("enter the first number:"+a);
     int b=s.nextInt();
     System.out.println("enter the second number:"+b);
     System.out.println("enter choice");
     int choice=s.nextInt();
     switch(choice){
     case 1:
    	 System.out.println("Addition:"+(a+b));
    	 break;
     case 2:
    	 System.out.println("substraction"+(a-b));
    	 break;
     case 3:
    	 System.out.println("multiplication"+(a*b));
    	 break;
     case 4:
    	 System.out.println("division"+(a/b));
    	 break;
    	 default:
    		 System.out.println("wrong choice");
     }
	 s.close();

	}
	 


}
