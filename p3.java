import Practical.PMarks;
import Theory.TMarks;
class Student{
    String rollNumber,name; double res1,res2,res3,avg;
    PMarks p = new PMarks(); TMarks t = new TMarks();
    Student(String a, String b, double p1, double p2, double p3, double t1, double t2, double t3){
        rollNumber=a; name=b;  
        p.marksPMath = p1; p.marksPPhy = p2; p.marksPChe = p3; 
        t.marksTMath = t1; t.marksTPhy = t2; t.marksTChe = t3;
    }
    void addPractThe(){
        res1 = p.marksPMath + t.marksTMath;
        res2 = p.marksPPhy + t.marksTPhy;
        res3 = p.marksPChe + t.marksTChe;
    }
    double average(){
        return ((res1+res2+res3)/3);
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+rollNumber);
    }
}
public class p3 {
    public static void main(String[] args) {
        Student s1 = new Student("CSE/22/008", "Sagnik", 75, 98, 92, 76, 79, 97);
        s1.addPractThe(); 
        double G = s1.average();
        s1.display();
        if(G >= 90)
            System.out.println("Grade is 'O'");
        else if(G >= 80)
            System.out.println("Grade is 'E'");
        else if(G >= 70)
            System.out.println("Grade is 'A'");
        else if(G >= 60)
            System.out.println("Grade is 'Just Pass'");
        else
            System.out.println("Grade is 'FAIL'");
    }
}