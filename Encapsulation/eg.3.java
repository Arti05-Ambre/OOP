package encapsulation;

class Laptop{
	private String brand;
	private int ramsize;
	private int Price;
	
public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRamsize() {
		return ramsize;
	}

	public void setRamsize(int ramsize) {
		if(ramsize > 0) {
		this.ramsize = ramsize;
		}else {
			System.out.println("NOT working proper");
		}
	}
	

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		
	if(price >10000) {
		Price = price;
	}else {
		System.out.println("laptop is not available");}
	}
	}

public class Encapsulation {

	public static void main(String[] args) {
		Laptop c1 = new Laptop();
		c1.setBrand("HP");
		c1.setRamsize(12);
		c1.setPrice(100000);
		System.out.println("Brand of the Laptop is: "  +   c1.getBrand());
		System.out.println("Ram size of the laptop is: "  +  c1.getRamsize() + "Ram");
		System.out.println("Maximum  price of the laptop is: " +   c1.getPrice());
		c1.setRamsize(-6);
		c1.setPrice(1000);
		
	}
}
