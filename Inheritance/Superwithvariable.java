package com.inheritance;
class Hospital{
	String Doctername = "Dr_Arote";
}
class Patient extends Hospital{
	String patientname = "ABCD";
	void display() {
		System.out.println(super.Doctername);
		System.out.println(this.patientname);
		}
}

public class Superwithvariable {
	public static void main(String[] args) {
	 Patient h1 = new Patient ();
		h1.display();
	}

}
