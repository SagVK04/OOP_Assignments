/*Write a java code to accept personal information like name,
address, age for Person class and create Student & Faculty two subclasses of
Person. Student class has two more states roll & department and Faculty class
also has another two states. major subject & publication, Student class is
further divided into ExStudent with attributes (organizationName,
officeEmail) and CurrentStudent with attributes (semester, sgpa). Create an
object for each class ExStudent, CurrentStudent and Faculty and display all
details about ExStudent, CurrentStudent and Faculty.*/

class Person {
    String name, address; int age;
    Person(String n, String a, int ag) {
        name = n; address = a; age = ag;
    }
    void displayDetails() {
        System.out.println("Name: " + name); System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    String roll, dept;
    Student(String r, String d, String n, String a, int ag) {
        super(n, a, ag); roll = r; dept = d;
    }
    void displayDetails() {
        super.displayDetails(); System.out.println("Roll: " + roll);
        System.out.println("Dept: " + dept);
    }
}
class Faculty extends Person {
    String ms, pub;
    Faculty(String m, String p, String n, String a, int ag) {
        super(n, a, ag); ms = m; pub = p;
    }
    void displayDetails() {
        super.displayDetails(); System.out.println("Major Subject: " + ms);
        System.out.println("Publication: " + pub);
    }
}
class Ex extends Student {
    String org, email;
    Ex(String o, String e, String r, String d, String n, String a, int ag) {
        super(r, d, n, a, ag); org = o; email = e;
    }
    void displayDetails() {
        super.displayDetails(); System.out.println("Organisation: " + org);
        System.out.println("Email: " + email);
    }
}
class Current extends Student {
    String sem;
    double sgpa;
    Current(String s, double sg, String r, String d, String n, String a, int ag) {
        super(r, d, n, a, ag);
        sem = s;
        sgpa = sg;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Semester: " + sem);
        System.out.println("SGPA: " + sgpa);
    }
}
public class p5 {
    public static void main(String args[]) {
        System.out.println("Ex Student..");
        Ex exs = new Ex("TCS", "amar@gmail.com", "CSE/18/003", "CSE", "Amar", "Kolkata", 32);
        exs.displayDetails();
        System.out.println(" ");
        System.out.println("Current Student..");
        Current crs = new Current("5th", 8.22, "CSE/22/008", "CSE", "Sagnik", "Amta", 20);
        crs.displayDetails();
        System.out.println(" ");
        System.out.println("Faculty..");
        Faculty fac = new Faculty("DBMS", "Popular Publications", "Bijay", "Kolaghat", 47);
        fac.displayDetails();
    }
}