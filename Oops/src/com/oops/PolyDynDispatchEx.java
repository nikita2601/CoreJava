package com.oops;
class Vehicle{
	void disp() {
		System.out.println("this is parent class");
	}
}
class carab extends Vehicle{ 
	void disp() {
		System.out.println("this is a Car");
	}
}
class bus extends Vehicle{
	void disp() {
		System.out.println("this is the Bus");
	}
}
class bycycleab extends Vehicle{
	void disp() {
		System.out.println("this is a bycycle");
	}
}
public class PolyDynDispatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle x1=new Vehicle();
		x1.disp();
		//Dynamic method dispatch
		Vehicle c1,b1,a1;     // through refrence called a child class object
		c1=new carab();       // line no : 30,31,32 is a child class. 
		b1=new bus();
		a1=new bycycleab();
		c1.disp();
		b1.disp();
		a1.disp();
	}

}
