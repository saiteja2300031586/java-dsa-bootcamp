package phase01;

class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    public void eat() {
        System.out.println(name + " is eating");
    }
}

class dog extends Animal {
    
    dog(String name) {
        super(name);
    }
    
    public void bark() {
        System.out.println(name + " is barking");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        dog d = new dog("Tommy");
        d.eat();
        d.bark();
    }
}