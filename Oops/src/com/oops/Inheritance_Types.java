package com.oops;
class AccountHolder{
	void Info(String accNo,String name) {
		System.out.println("Account number:"+accNo+"\nname:"+name);
	}
}
class Bank{
	void getRoi(double roi) {
		System.out.println("Bank intreset:"+roi);
	}
}
public class Inheritance_Types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountHolder a1= new AccountHolder();
		a1.Info("489456","sanket");
		Bank b1=new Bank();
		b1.getRoi(5.6);
  
	}

}
