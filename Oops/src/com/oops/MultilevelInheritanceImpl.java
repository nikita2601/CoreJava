package com.oops;
class Vehical {
	double speed(double s) {
		return s;
	}
}
class Car extends Vehical{
	String showColor(String color) {
		return color;
	}
}
class Bike extends Car{
	int showPrise(int prise) {
		return prise;
	}
}
class Bycycle extends Bike{
	int showyearmodel(int year) {
		return year;
	}
}
public class MultilevelInheritanceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bycycle b=new Bycycle();
System.out.println("the speed of vehical:"+b.speed(9.36));
System.out.println("the color of car:"+b.showColor("blue"));
System.out.println("the prise of car:"+b.showPrise(90000));
System.out.println("show the model year of car:"+b.showyearmodel(2024));


	}

}
 