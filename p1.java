/*Write A Program In Java To Create A Class Student With Data
Members 'Name, City And Age' Along With The Method Setdata() To Set The
Values And Printdata() To Display The Data. */

class Student {
    String name;
    String city;
    int age;
    void setData() {
        name = "Sagnik";
        city = "Amta";
        age = 20;
    }
    void printData() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}
public class p1 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setData();
        obj.printData();
    }
}