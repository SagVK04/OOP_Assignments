/*Write a program to design a class AreaCalculation and
then find out the area (using method overloading) of a circle whose
radius is 7cm, area of rectangle whose length is 4.5cm and breadth
is 4cm and also the area of cuboid whose length, breadth & height
are 3cm, 2cm & 4cm respectively.*/

class AreaCalculation {
    float area;
    float r;
    float length;
    float breadth;
    float height;
    void area(float r) {
        area = 3.14f * r * r;
        System.out.println("Area of circle: " + area + " sq. cm.");
    }
    void area(float length, float breadth) {
        area = length * breadth;
        System.out.println("Area of rectangle: " + area + " sq. cm.");
    }
    void area(float length, float breadth, float height) {
        area = 2 * ((length * breadth) + (breadth * height) + (height * length));
        System.out.println("Area of cuboid: " + area + " sq. cm.");
    }
}
public class p4 {
    public static void main(String[] args) {
        AreaCalculation circle = new AreaCalculation();
        circle.area(7f);
        AreaCalculation rectangle = new AreaCalculation();
        rectangle.area(4.5f, 4f);
        AreaCalculation cuboid = new AreaCalculation();
        cuboid.area(3f, 2f, 4f);
    }
}
