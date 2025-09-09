package com.inheritanc;
class Animal { 
	 
    void sound() { 
        System.out.println("Animal makes a sound"); 
    } 
} 
 
class Dog extends Animal { 
 @Override 
    void sound() 
  { 
        System.out.println("Dog barks"); 
    } 
} 
 
class Cat extends Animal { 
  
 @Override 
    void sound() { 
        System.out.println("Cat meows"); 
    } 
} 
 
public class Overriding{ 
    public static void main(String[] args) { 
      Animal a1 = new Animal(); 
      Dog d1 = new Dog(); 
      Cat c1 = new Cat(); 
      a1.sound(); //Here we can see that , the same method of animal class i.e 
   
      d1.sound(); 
      c1.sound(); 
    } 
} 


