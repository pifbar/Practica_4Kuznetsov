package MyPackage;

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(5.5, "RED", false);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        Shape r = new Rectangle(1.0, 2.0, "BLUE", true);
        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());

        Shape s = new Square(6.6, "GREEN", false);
        System.out.println(s);
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());
    }
}