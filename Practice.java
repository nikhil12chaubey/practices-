//abstrations 
abstract class Shape {
    // ENCAPSULATION
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calculateArea();
}

// inheritance
class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // POLYMORPHISM
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// INHERITANCE
class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // POLYMORPHISM
    @Override
    public double calculateArea() {
        return width * height;
    }
}

// POLYMORPHISM
public class Practice {
    public static void main(String[] args) {
        Shape circle = new Circle("red", 5);
        Shape rectangle = new Rectangle("blue", 10, 20);

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}