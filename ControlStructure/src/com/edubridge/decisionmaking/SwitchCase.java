package com.edubridge.decisionmaking;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 System.out.println("enter choice");
 int choice=s.nextInt();
 switch(choice){
 case 1:
	 System.out.println("Monday");
  break;
 case 2:
	 System.out.println("Tuesday");
	 break;
 case 3:
	 System.out.println("wednusday");
    break;
 case 4:
	 System.out.println("thursday");
	    break;
 case 5:
	 System.out.println("friday");
	    break;
 case 6:
	 System.out.println("saturday");
	    break;
 case 7:
	 System.out.println("sunday");
	    break;
	    default:
	    	System.out.println("worng choice");
	 


 
 }
 s.close();

	}
	 

}
