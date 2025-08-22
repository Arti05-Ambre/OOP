package newthis;
class  Name{
	int a;
	int b;
	void add(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("the sum of a and b is:" + (a+b));
		
	}
}
	
public class ThiswithVariable {
	public static void main(String[] args) {
		Name n1 = new Name();
		n1.add(23, 45);
	}

}
