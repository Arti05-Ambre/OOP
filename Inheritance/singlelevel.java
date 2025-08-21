package com.inheritances;
class Car {
	  void drive() {
		 System.out.println("The car is driving.");
	 }

}
class BMW extends Car{
	@Override
	 void drive() {
		System.out.println("The BMW is driving smoothly.");
	}
}
public class Class {
public static void main(String[] args) {
	BMW b1 = new BMW();
	b1.drive();
	
	}
}
