import java.util.*;
class Student{
	int roll;
	void getRoll(int roll){
		this.roll = roll;
	}
	void displayRoll(){
		System.out.println("Roll no: "+roll);
	}
}
class Test extends Student{
	float m1,m2;
	void getMarks(float m1, float m2){
		this.m1 = m1; this.m2 = m2;
	}
	void displayMarks(){
                System.out.println("1st Marks: "+m1);
		System.out.println("2nd marks: "+m2);
	}
}
interface Games{
	double gamewt = 8.0;
	void displaywt();
}
class Result extends Test implements Games{
	public void displaywt(){
		System.out.println("Game weight: "+gamewt);
	}
}
public class p6{
	public static void main(String args[]){
		Result r = new Result();
		r.getRoll(8); r.displayRoll(); System.out.println();
		r.getMarks(67f,76f); r.displayMarks(); System.out.println();
		r.displaywt();
	}
}