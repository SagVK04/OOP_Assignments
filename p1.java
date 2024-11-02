/*Write a Java program to create an Employee class to manage
employee's information such as employee id, name, date of birth, designation
and basic salary. Use parameterized constructor to initialize object of
Employee class. Define printData() methods to display employee details and
Net Salary. The Net Salary is sum of hasic salary + HRA + DA, where HRA is
20% of basic salary and DA is 90% of basic salary.*/
/*Code*/

class Employee {
    int id;
    String name;
    String dob;
    String des;
    double bs;
    Employee(int i, String n, String d, String ds, double b) {
        id = i;
        name = n;
        dob = d;
        des = ds;
        bs = b;
    }
    void printData() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Date of birth: " + dob);
        System.out.println("Designation: " + des);
        System.out.println("Net Salary: " + (bs + (bs * 0.2) + (bs * 0.9)) + " Rs.");
    }
}
public class p1 {
    public static void main(String args[]) {
        System.out.println("Printing details...");
        Employee emp = new Employee(7000, "Sagnik Metiya", "10/2004", "Student", 7000);
        emp.printData();
    }
}