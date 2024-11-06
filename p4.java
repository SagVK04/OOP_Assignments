import shapePack.shape3D;
class Parallelopiped implements shape3D{
    double l,w,h;
    Parallelopiped(double length, double width, double height){
        l = length; w = width; h = height;
    }
    public void calcArea(){
        System.out.println("Area of parallelopiped: "+((2*l*w) + (2*w*h) + (2*l*h)));
    }
    public void calcVolume(){
        System.out.println("Volume of parallelopiped: "+(l*w*h));
    }
}
class Cube implements shape3D{
    double s;
    Cube(double side){
        s = side;
    }
    public void calcArea(){
        System.out.println("Area of cube: "+(6*s*s));
    }
    public void calcVolume(){
        System.out.println("Volume of cube: "+(s*s*s));
    }
}
class Sphere implements shape3D{
    double r;
    Sphere(double radius){
        r = radius;
    }
    public void calcArea(){
        System.out.println("Area of sphere: "+(4*PI*r*r));
    }
    public void calcVolume(){
        System.out.println("Volume of sphere: "+((4/3)*PI*r*r*r));
    }
}
public class p4 {
    public static void main(String[] args) {
        Parallelopiped p1 = new Parallelopiped(8.6,7.05,4.2);
        p1.calcArea(); p1.calcVolume();
        Cube c1 = new Cube(7.6);
        c1.calcArea(); c1.calcVolume();
        Sphere s1 = new Sphere(5.4);
        s1.calcArea(); s1.calcVolume();
    }
}
