/*Create a class Shape with methods calc_perimeter() and
calc_area(). Derive two classes Circle(data member: radius) and
Rectangle(data member: length & breadth) from it. Use constructor for object
initialization. Calculate perimeter and area for both the shapes. (Use of
method overriding).*/

class Shape {
    double radius, length, breadth;
    void calc_perimeter() {
        System.out.println("Perimetr calculation:");
    }
    void calc_area() {
        System.out.println("Area calculation: ");
    }
}
class Circle extends Shape {
    Circle(double r) {
        radius = r;
    }
    void calc_perimeter() {
        System.out.println("Perimeter of circle: " + (2 * 3.14 * radius) + " cm.");
    }
    void calc_area() {
        System.out.println("Area of circle: " + (3.14 * radius * radius) + " sq. cm.");
    }
}
class Rectangle extends Shape {
    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }
    void calc_perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + breadth)) + " cm.");
    }
    void calc_area() {
        System.out.println("Area of circle: " + (length * breadth) + " sq. cm.");
    }
}
public class p2 {
    public static void main(String args[]) {
        Circle c = new Circle(7.5);
        c.calc_perimeter();
        c.calc_area();
        Rectangle rec = new Rectangle(7, 5.5);
        rec.calc_perimeter();
        rec.calc_area();
    }
}
