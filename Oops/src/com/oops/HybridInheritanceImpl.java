package com.oops;
class Animal{
	void eat() {
		System.out.println("Animal Class");
	}
}
class Dog extends Animal{
	String Color="brown";
	void dispcolor() {
		System.out.println("Dog color:"+Color);
	}
}
class Cat extends Animal{
	void bark() {
		System.out.println("cat is barking");
	}
}
class BabyDog extends Dog{
	String age="2months";
	void dispAge() {
		System.out.println("the age of baby dog is :"+age);
	}
}

public class HybridInheritanceImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cat c1=new Cat();
c1.bark();
c1.eat();
BabyDog g1=new BabyDog();
g1.dispAge();
g1.dispcolor();
	}

}
