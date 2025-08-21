package com.inheritances;
class Vehicle{
	 protected  void StartEngine() {
		 System.out.println("The engine is start");
		 
		
	}
}
	 class Carsess extends Vehicle{
		 
	 }


public class Modifier {
	public static void main(String[] args) {
		Carsess c1 = new Carsess();
		c1.StartEngine();
	}

}
output:-
  The engine is start
