/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 'Rectangle Area' taking two
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'Rectangle Area' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
all the three methods 'Rectangle Area', 'SquareArea' and 'CircleArea' for printing the
area of rectangle, square and circle respectively. Create an object of class 'Area' and
call all the three methods.*/
abstract class Shape{
	abstract void RectangleArea(float l, float b);
	abstract void SquareArea(float s);
	abstract void CircleArea(float r);
}
class Area extends Shape{
	void RectangleArea(float l, float b){
		System.out.println("Area of Rectangle: "+(l*b)+" sq. unit");
	}
	void SquareArea(float s){
		System.out.println("Area of Square: "+(s*s)+" sq. unit");
	}
	void CircleArea(float r){
                System.out.println("Area of Circle: "+(3.14*r*r)+" sq. unit");
        }
}
public class p2{
	public static void main(String args[]){
		Area a1 = new Area();
		a1.RectangleArea(25f,3.5f);
		System.out.println();
		a1.SquareArea(7.2f);
		System.out.println();
		a1.CircleArea(5.5f);
	}
} 