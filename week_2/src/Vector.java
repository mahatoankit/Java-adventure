public class Vector {
	private double x;
	private double y;
	
	Vector(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	double getX() { return x; }
	double getY() { return y; }
	
	Vector scale(int factor) {
		double newX = this.x * factor;
		double newY = this.y * factor;
		return new Vector(newX, newY);
	}
	
	Vector subtract(Vector other) {
		double newX = this.x - other.x;
		double newY = this.y - other.y;
		return new Vector(newX, newY);
	}
	
	
	double length() {
		double rSquared = Math.pow(this.x, 2) + Math.pow(this.y, 2);
		return Math.sqrt(rSquared);	
	}
	
	Vector add(Vector vector){
		double newX = this.x + vector.x;
		double newY = this.y + vector.y;
		return new Vector(newX, newY);
	}
	
	void printVector(){
		System.out.println("Vector x :" + this.x);
		System.out.println("Vector y :" + this.y);
		System.out.println("Vector length :" + this.length());
	}
	

	public static void main(String[] args) {
//		Vector vec = new Vector(2.11, 3.11);
//		Vector vecSub = vec.subtract(vec);
//		System.out.println(vecSub);
	}
}