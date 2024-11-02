/*Write a program to declare & instantiate array to hold 3 Student object.
Student class contains roll, name and three different subjects’ marks.
Find out the best student according to average marks of all subjects and
display all details of the best student.*/

class Student {
    String roll, name;
    double m1, m2, m3;
    Student(String r, String n, double m1, double m2, double m3) {
        roll = r; name = n; this.m1 = m1; this.m2 = m2; this.m3 = m3;
    }
}
public class p15 {
    public static double getAvg(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    static void display(Student s) {
        System.out.println("Printing best student details:");
        System.out.println("Name: " + s.name);
        System.out.println("Roll: " + s.roll);
        System.out.println("Marks 1: " + s.m1);
        System.out.println("Marks 2: " + s.m2);
        System.out.println("Marks 3: " + s.m3);
    }
    public static void main(String[] args) {
        Student s1 = new Student("CSE/007", "Sagnik", 97, 76, 85);
        Student s2 = new Student("CSE/017", "Vishal", 91, 87, 82);
        Student s3 = new Student("CSE/107", "Tanujoy", 99, 75, 90);
        Student[] a = { s1, s2, s3 };
        Student best = a[0];
        double bestAvg = getAvg(best.m1, best.m2, best.m3);
        for (int i = 0; i < a.length; i++) {
            if (getAvg(a[i].m1, a[i].m2, a[i].m3) > bestAvg) {
                bestAvg = getAvg(a[i].m1, a[i].m2, a[i].m3);
                best = a[i];
            }
        }
        display(best);
    }
}