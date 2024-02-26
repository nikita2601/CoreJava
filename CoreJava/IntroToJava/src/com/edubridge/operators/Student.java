package com.edubridge.operators;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  System.out.println("your id:");
  int id= s.nextInt();
  System.out.println("your name:");
  String name=s.next();
  System.out.println("m1 marks:");
  int m1=s.nextInt();
  System.out.println("m2 marks:");
  int m2=s.nextInt();
  System.out.println("m3 marks:");
  int m3=s.nextInt();
  int total=m1+m2+m3;
  System.out.println("total:"+total);
  double avg=total/3;
  System.out.println("avg:"+avg);
  
  s.close();
  if(avg>=90)
  {
	  System.out.println("A grade");
  }
  else if(avg>=75 && avg<90) {
	  System.out.println("B grade");
  }
  else if (avg>=35 && avg<55)
  {
	  System.out.println("C grade");
  }
  else {
	  System.out.println("fail");
  }
	 s.close();

  }

}
