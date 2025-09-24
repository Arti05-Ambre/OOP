package encapsulation;

class Car{
	private String brand;
	private String Model;
	private int speed;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed >= 0) {
			this.speed = speed;
	}
	else{
		System.out.println("car will be stop");
	}
	
}
}


public class Encapsulation {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setBrand("Audi");
		c1.setModel("Audi Q3");
		c1.setSpeed(240);
		System.out.println("Brand of the car is: "  +   c1.getBrand());
		System.out.println("Latest Model of the car is: "  +  c1.getModel());
		System.out.println("Maximum  speed of the car is: " +   c1.getSpeed());
		c1.setSpeed(120);
		
	}
}
