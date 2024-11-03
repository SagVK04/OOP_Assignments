package StudentSubPackage;
import studentPackage.Student;
public class StudentTMarks extends Student {
    public StudentTMarks(int r, String n, double o, double os, double s){
        Roll=r;name=n;mOOP=o;mOS=os;mSE=s;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+Roll);
        System.out.println("OOP Marks: "+mOOP);
        System.out.println("OS Marks: "+mOS);
        System.out.println("SE Marks: "+mSE);
        System.out.println("Total marks: "+(mOOP+mOS+mSE));
    }
}