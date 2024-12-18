public class Rectangle {
	Vector v1;
    Vector v2;
	
	Rectangle(Vector v1, Vector v2){
		this.v1 = v1;
		this.v2 = v2;
	}
	
	double getWidth(){
		return this.v2.getX() - this.v1.getX();
	}
	
	double getHeight(){
		return this.v2.getY() - this.v1.getY();
	}
	
	double getArea() {
		return this.getWidth() * this.getHeight();
	}
	
	Vector getCentre(){
		return this.v1.add(this.v2).scale((int) 0.5);
	}
	void printRectangle() {
		System.out.println("Vector v1 :");
		this.v1.printVector();
		System.out.println("Vector v2 :");
		this.v2.printVector();
	}
	
	boolean contains(Vector point) {
	    return (this.v1.getX() <= point.getX() && point.getX() <= this.v2.getX()) &&
	           (this.v1.getY() <= point.getY() && point.getY() <= this.v2.getY());
	}

	
	public static void main(String[] args) {
		
		Vector v1 = new Vector(1,3);
		Vector v2 = new Vector(4,5);
		Rectangle rect = new Rectangle(v1, v2);
		rect.printRectangle();
		Vector p = new Vector(2,4);
		System.out.println(rect.contains(p));
		System.out.println("Run completed");
	}
}
