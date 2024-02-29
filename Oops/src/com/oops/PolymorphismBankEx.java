package com.oops;
class AtmCard{
	void transactionHistory(int deposite) {
		System.out.println("deposite Rs:"+deposite);
	}
	void transactionHistory(long withdraw) {
		System.out.println("withdraw amount Rs:"+withdraw);
	}
}

public class PolymorphismBankEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmCard a1=new AtmCard();
		a1.transactionHistory(45500);
		a1.transactionHistory(458926L);
	}

}
