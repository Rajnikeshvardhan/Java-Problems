package interface3;

public class Main {
	
	public static void createShape() {
		
		Shape shape = new Shape() {
			
			void draw() {
			
			System.out.println("Drawing a shape using the Inner class\n");
			
		}
		
	};
	
	shape.draw();
	
}


public static void main(String args[]) {
	
	
	createShape();
}

}

	
	
