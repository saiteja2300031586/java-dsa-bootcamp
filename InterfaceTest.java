package phase01;

	interface Shape {
	    double area(); // no body — just a contract
	}

	class Circle implements Shape {
	    double radius;
	    
	    Circle(double radius) {
	        this.radius = radius;
	    }
	    
	    public double area() {
	        return 3.14 * radius * radius;
	    }
	}

	class Rectangle implements Shape {
	    double length, width;
	    
	    Rectangle(double length, double width) {
	        this.length = length;
	        this.width = width;
	    }
	    
	    public double area() {
	        return length * width;
	    }
	}

	class InterfaceTest {
	    public static void main(String[] args) {
	        Shape s1 = new Circle(5);
	        Shape s2 = new Rectangle(4, 6);
	        
	        System.out.println("Circle area: " + s1.area());
	        System.out.println("Rectangle area: " + s2.area());
	    }
	}

