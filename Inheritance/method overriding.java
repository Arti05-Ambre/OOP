package com.inheritances;
class Bank{
	double GetInterestRate() {
		return 8.0;
		
	}
	
}
class SBI extends Bank{

	double GetInterestRate() {
		return 8.4;
	}
}
class ICICI extends Bank{

	double GetInterestRate() {
		return 7.3;
	}
}

public class Example {
	public static void main(String[] args) {
		Bank b1 = new Bank();
		SBI s1 = new SBI();
		ICICI i1 = new ICICI();
		
		System.out.println("Bank Intrest Rate:" + b1.GetInterestRate());
		System.out.println("SBI Intrest Rate:" + s1.GetInterestRate());
		System.out.println("icici Intrest Rate:" + i1.GetInterestRate());
		
	}

}

output : -

Bank Intrest Rate:8.0
SBI Intrest Rate:8.4
icici Intrest Rate:7.3

