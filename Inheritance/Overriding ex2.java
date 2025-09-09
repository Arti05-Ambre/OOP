package com.inheritanc;


class Bank{
	void getInterestRate() {
		double IntrestRate = 8.0;
		System.out.println("Intrest Rate is: " + IntrestRate);
			
		}
	}
class SBI extends Bank{
	@Override
	void getInterestRate() {
		double IntrestRate = 8.4;
		
		System.out.println("SBI Intrest Rate is:" + IntrestRate);
	}
}
class ICICI extends Bank {
	@Override
	void getInterestRate() {
		double IntrestRate = 7.3;
		System.out.println("ICICI Intrest Rate is: "+ IntrestRate );
	}
	
}
public class Overriding{ 
    public static void main(String[] args) { 
    	Bank B1 = new Bank();
    	B1.getInterestRate();
    	SBI S1 = new SBI();
    	S1.getInterestRate();
    	ICICI I1 = new ICICI();
    	I1.getInterestRate();
      
    } 
} 


output:-

Intrest Rate is: 8.0
SBI Intrest Rate is:8.4
ICICI Intrest Rate is: 7.3
