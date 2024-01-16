

		class Shape {
		    void draw() {
		        System.out.println("Drawing a shape...");
		    }
		}

		
		class Circle extends Shape {
		    void draw() {
		        System.out.println("Drawing a circle...");
		    }
		}

		
		class Rectangle extends Shape {
		    void draw() {
		        System.out.println("Drawing a rectangle...");
		    }
		}

		
		class Triangle extends Shape {
		    void draw() {
		        System.out.println("Drawing a triangle...");
		    }
		}

		
		public class TestHierarchicalInheritance {
		    public static void main(String[] args) {
		        Circle circle = new Circle();
		        Rectangle rectangle = new Rectangle();
		        Triangle triangle = new Triangle();

		       
		        circle.draw();      
		        rectangle.draw();   
		        triangle.draw();    
		    }
		}


