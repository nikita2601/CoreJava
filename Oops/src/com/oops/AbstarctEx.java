package com.oops;
abstract class Bag{
	String type="fastrack";
	//abstract void show();
	void color(String c) {
		System.out.println("bag colour:"+c);
	}
}
class BagInfo extends Bag{
	void show() {
		System.out.println("this is abstract method which override from bag class ");
	}
	
}
public class AbstarctEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BagInfo b1=new BagInfo();
		System.out.println(b1.type);
		b1.color("black");
		b1.show();
	}

}
