package Shape;
public class Figure {
    public double s,l,w,h,r;
    public void vol(double side){
        s = side;
        System.out.println("Volume of cube: "+(s*s*s));
    }
    public void vol(double radius, double height){
        r = radius; h = height;
        System.out.println("Volume of cube: "+(s*s*s));
    }
    public void vol(double length, double width, double height){
        l = length; h = height; w = width;
        System.out.println("Volume of rectangle: "+(l*w*h));
    }
}
