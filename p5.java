/*Define a Student class (roll: integer, number: string,
marks: float). Define no argument and parameterized getter
methods for initializing student object. Create two student objects.
One object is initialized using parameterized getter method and
second one is initialized using no-argument getter methods. Also
print the contents of each object using display() method. (Use of
method overloading)*/

class Student {
    int roll;
    String name;
    float marks;
    void setData() {
        roll = 22;
        name = "Akash";
        marks = 8.3f;
    }
    void setData(int r, String n, float m) {
        roll = r;
        name = n;
        marks = m;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
    }
}
public class p5 {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setData(32, "Sagnik", 7.5f);
        obj.display();
        obj1.setData();
        obj1.display();
    }
}
