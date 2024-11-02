/*Define A Student Class (Roll: Integer, Number: String, Marks:
Float). Define Parameterized Setter Method To Set The Student Data Members
And Display Method To Print Student Details. Instantiate A Student Object
Using Parameterized Setter Method And Use Display Method To Print The
Details Of The Student. */
class Student {
    int roll;
    String name;
    float marks;
    void setData(int roll, String name, float marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    void printData() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }
}
public class p2 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setData(32, "Sagnik", 7.5f);
        obj.printData();
    }
}