/*Write a Java program to create a super class Vehicle having data
member: regNo, company Name and price. Derive two different classes Light
Motor Vehicle (members mileage) and Heavy Motor Vehicle (members
capacity-in-tons). Accept the information for both light and heavy motor
vehicles using parameterized getData() method and display the information
using displayDetails() method. (use of super keyword in method overriding)*/

class Vehicle {
    String regNo, companyName;
    double price;
    void getData(String r, String cmp, double p) {
        regNo = r;
        companyName = cmp;
        price = p;
    }
    void displayDetails() {
        System.out.println("Registration No: " + regNo);
        System.out.println("Company Name: " + companyName);
        System.out.println("Price: " + price);
    }
}
class LM extends Vehicle {
    double mileage;
    void getData(String r, String cmp, double p, double m) {
        super.getData(r, cmp, p);
        mileage = m;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Mileage: " + mileage);
    }
}
class HM extends Vehicle {
    double capacity;
    void getData(String r, String cmp, double p, double cp) {
        super.getData(r, cmp, p);
        capacity = cp;
    }
    void displayDetails() {
        super.displayDetails();
        System.out.println("Capacity: " + capacity);
    }
}
public class p3 {
    public static void main(String args[]) {
        System.out.println("Display heavy motor..");
        HM h = new HM();
        h.getData("555", "TATA", 570000, 500);
        h.displayDetails();
        System.out.println(" ");
        System.out.println("Display light motor..");
        LM l = new LM();
        l.getData("558", "HYUNDAI", 770000, 23);
        l.displayDetails();
        System.out.println(" ");
    }
}
