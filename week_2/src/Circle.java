public class Circle {
	double radius;
	Vector center;
	
	Circle(double radius, Vector center){
		this.radius = radius;
		this.center = center;
	}
	
	double getDiameter() {
		return 2 * this.radius;
	}
	
	double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}
	
	boolean contains(Vector point) {
		Vector offset = point.subtract(this.center);
		return offset.length() <= this.radius;
	}
	
	Rectangle boundingBox() {
		double cx = this.center.getX();
		double cy = this.center.getY();
		Vector p1 = new Vector(cx - this.radius, cy - this.radius);
		Vector p2 = new Vector(cx + this.radius, cy + this.radius);
		return new Rectangle(p1, p2);
	}
	public static void main(String[] args) {
		
	}

}