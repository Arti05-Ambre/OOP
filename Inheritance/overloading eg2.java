package polymorphisms;
class Calculator{
	int add(int a, int b) {
		return a+b;
	}
 double add( double a, double b) {
	 return a+b;
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println( c1.add(23, 45));
		System.out.println(c1.add(23, 56));
		
	}

}
