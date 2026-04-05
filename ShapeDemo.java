package phase01;

class Shap {
    String color;
    
    Shap(String color) {
        this.color = color;
    }
    
    public void show() {
        System.out.println("Color: " + color);
    }
}

class Circle2 extends Shap {
    double radius;
    
    Circle2(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public void show() {
        super.show();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + (3.14 * radius * radius));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Circle2 c = new Circle2("Red", 7);
        c.show();
    }
}