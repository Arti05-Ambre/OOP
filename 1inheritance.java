
 package com.inheritance;

class Animal{
	String Animalcolor = "White" ;
	String Animalhabitat = " anywhere";
	String Animalfood = " Omnivores";
	void display() {
		System.out.println("Color of animal is "+ Animalcolor);
		System.out.println("Animals live in/on" + Animalhabitat);
		System.out.println("Animal food is" + Animalfood);
	}
}
	
 class Aquatic extends Animal{
	 void display0() {
	 System.out.println("Animals that live in water");
	 }
 }
 class Aerial extends Animal {
	 void display1() {
		 System.out.println("Animals that live in air");
	 }
	 
 }
  class Terrestrial extends Animal{
	  void display2() {
		  System.out.println("Animals that live on land");
		  
	  }
	  
  }
  class Desert extends Animal{
	  void display3() {
		  System.out.println("Animals that live in desert");
	  }
  }
  class Tiger extends Terrestrial{
	  
  }
  
  class Fish extends Aquatic{
	  
  }
  class Eagle extends Aerial{
	  
  }
  

public class Demo {
	public static void main (String[]  args) {
		Tiger a1 = new Tiger();
		a1.display2();
		a1.display();
		System.out.println("");
		Fish f1 = new Fish();
		f1.display();
		f1.display0();
		System.out.println("");
		Eagle e1 = new Eagle();
		e1.display();
		e1.display1();
	}
}




output
	


