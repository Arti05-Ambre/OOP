package newthis;
class Arthmatics{
	int a = 67;
	int b = 34;
	void SUM() {
		this.sub();
	System.out.println("Addition of two number is:"+(a+b));
		
	}
	void sub() {
		this.Multiply();
		System.out.println("Subtraction of two number is:" + (a - b));
	}
	void Multiply() {
		this.division();
		System.out.println("Multiplication of two number is:" + (a * b));
	
	}
	void division() {
		this.module();
		System.out.println("Division of two number is:" + (a / b) );
		
	}
	void module() {
		System.out.println("Module of two number is:" + (a%b));
	}
}

public class Thiswithmethod {
	public static void main(String[] args) {
		Arthmatics a1 = new Arthmatics();
		a1.SUM();
	}

}

output:- 
  Module of two number is:33
Division of two number is:1
Multiplication of two number is:2278
Subtraction of two number is:33
Addition of two number is:101

