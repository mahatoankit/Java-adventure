package inheritance;

public class Vehicle {
	protected String brand;
	protected int speed;
	protected int noOfWheelers;
	
	public Vehicle(String brand,int maxSpeed, int noOfWheelers) {
		this.brand = brand;
		this.speed = maxSpeed;
		this.noOfWheelers = noOfWheelers;
	}
	
	public void start() {
		System.out.println(brand + " is starting");
	}
	public void accelerate() {
		speed += 5;
		System.out.println(brand + " is accelerating. speed" + speed);
	}

}
