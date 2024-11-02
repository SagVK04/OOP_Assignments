/*Define a class "Staff" with members name and address. Define two
sub-classes of Staff class "FullTimeStaff" (department, salary) and
"PartTimeStaff" (number of hours, rate perhour). Define appropriate
parameterized constructors for parent as well as child class. Create one object
for each Full TimeStaff and PartTimeStaff class and then Display details of the
"FullTimeStaff" and "PartTimeStaff" objects.*/

class Staff {
    String name, address;
    Staff(String n, String a) {
        name = n;
        address = a;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }
}
class FS extends Staff {
    double salary;
    String dept;
    FS(String d, double s, String n, String a) {
        super(n, a);
        salary = s;
        dept = d;
    }
    void displayDetails() {
        System.out.println("Full Time..");
        super.displayDetails();
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + dept);
        System.out.println(" ");
    }
}
class PS extends Staff {
    int hours, rate;
    PS(int h, int r, String n, String a) {
        super(n, a);
        hours = h;
        rate = r;
    }
    void displayDetails() {
        System.out.println("Part Time..");
        super.displayDetails();
        System.out.println("Number of hours: " + hours);
        System.out.println("Rate per hour: " + rate);
        System.out.println(" ");
    }
}
public class p4 {
    public static void main(String args[]) {
        FS f = new FS("CSE", 50000, "Amar", "Delhi");
        f.displayDetails();
        PS p = new PS(9, 800, "Bikash", "Kolkata");
        p.displayDetails();
    }
}