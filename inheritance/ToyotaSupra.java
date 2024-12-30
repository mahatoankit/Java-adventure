package inheritance;

public class ToyotaSupra extends Vehicle{
	private String model;
	private int maxSpeed;
	private int numDoors;
	
	public ToyotaSupra(String brand, int speed, int noOfWheelers, String model, int maxSpeed, int numDoors) {
		super(brand, speed, noOfWheelers);
		this.model = model;
		this.maxSpeed = maxSpeed;
		
	}
	
	@Override
	public void start() {
		System.out.println("Supra is starting, ratatatatatatata");
	}
	
	@Override
	public void accelerate() {
		System.out.println(brand + "is speeding up");
	}

	
	public void drift() {
		System.out.println("Toyota supraa is drifting");
	}
}
