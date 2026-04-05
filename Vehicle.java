package phase01;

class Vehicle {
	
	    String brand;
	    int speed;
	    
	    Vehicle(String brand, int speed) {
	        this.brand = brand;
	        this.speed = speed;
	    }
	    
	    public void show() {
	        System.out.println("Brand: " + brand + ", Speed: " + speed);
	    }
	}

	class Car extends Vehicle {
	    int doors;
	    
	    Car(String brand, int speed, int doors) {
	        super(brand, speed); // calls Vehicle constructor
	        this.doors = doors;
	    }
	    
	    public void show() {
	        super.show(); // calls Vehicle's show method
	        System.out.println("Doors: " + doors);
	    }
	}

	class VehicleDemo {
	    public static void main(String[] args) {
	        Car c = new Car("Toyota", 180, 4);
	        c.show();
	    }
	}

