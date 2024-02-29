package com.oops;

public class SamplrToHospital {
	
 public static void main(String args[]) {
	 Sample s1=new Sample();
	 s1.setName("City hospital");
	 s1.setContact(124598798);
	 s1.setAddress("thane");
	 s1.setEmail("abc@gmail.com");
	 System.out.println("hospital name:"+s1.getName()+
			 "\n hospital contact number:"+s1.getContact()+
			 "\n hospital address:"+s1.getAddress()+
			 "\n hospital email id:"+s1.getEmail());
 }
}
