package phase01;

class Animal {
	
	    public void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

	class Dog extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Dog barks");
	    }
	}

	class Cat extends Animal {
	    @Override
	    public void sound() {
	        System.out.println("Cat meows");
	    }
	}

	class AnimalTest {
	    public static void main(String[] args) {
	        Animal a1 = new Dog();
	        Animal a2 = new Cat();
	        
	        a1.sound();
	        a2.sound();
	    }
	}

