package com.inheritances;
class Person{
	void Geet() {
		System.out.println("I am the person");
		
	}

}
class Student extends Person{
	void Geet() {
		super.Geet();
		System.out.println("and i am Student.");
}
	}

 

public class Per {
	public static void main(String[] args) {
  Student s1 = new Student();
  s1.Geet();
	}

}
output:-
i am the person
and i am student
