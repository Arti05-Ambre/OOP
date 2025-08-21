package com.inheritances;
class Vehical {
	Vehical(){
		System.out.println("Vehicle created");
	}
}
class Cars extends Vehical{
	int wheel;
	Cars(int wheel){
		super();
		this.wheel = wheel;
		System.out.println("the car has:"+ wheel  + "wheel");
	}
}
class Electriccar extends Cars{
	int Battreylife;
	Electriccar(int wheel, int Battreylife){
		super(wheel);
		this.Battreylife = Battreylife;
		System.out.println("the battery life of electric car is:"+ Battreylife + "years");
	}
}
public class Examp {
	public static void main(String[] args) {
		Electriccar e1 = new Electriccar(23, 12);
	}

}


output :-
  Vehicle created
the car has:23wheel
the battery life of electric car is:12years

