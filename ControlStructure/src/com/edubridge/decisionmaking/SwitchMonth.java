package com.edubridge.decisionmaking;

import java.util.Scanner;

public class SwitchMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 System.out.println("enter choice");
		 int choice=s.nextInt();
		 switch(choice){
		 case 1:
			 System.out.println("jan");
		  break;
		 case 2:
			 System.out.println("feb");
			 break;
		 case 3:
			 System.out.println("march");
		    break;
		 case 4:
			 System.out.println("april");
			    break;
		 case 5:
			 System.out.println("may");
			    break;
		 case 6:
			 System.out.println("june");
			    break;
		 case 7:
			 System.out.println("jule");
			    break;
		 case 8:
			 System.out.println("aug");
			    break;
		 case 9:
			 System.out.println("sep");
			    break;
		 case 10:
			 System.out.println("oct");
			    break;
		 case 11:
			 System.out.println("nov");
			    break;
		 case 12:
			 System.out.println("dec");
			    break;
			    default:
			    	System.out.println("worng choice");
			 

	}
		 s.close();
	}
}


