/*Write a java program to create a class named Fuel which
contains two static float data member ratePetrol and rateDiesel having initial
values Rs 20 and Rs 10 respectively. Assume on creation of every object of
Fuel class the rate of petrol and diesel will be hiked automatically by 10%.
Display initial fuel rate. Next create 5 objects of Fuel class and display fuel
rate immediate after creation each object. (use of static variable and method) */

class Fuel {
    static float ratePetrol;
    static float rateDiesel;
    Fuel(float a, float b) {
        ratePetrol = a; rateDiesel = b;
        if (rateDiesel == 10 || ratePetrol == 20) {
            System.out.println("Initial value of petrol is Rs. " + ratePetrol);
            System.out.println("Initial value of diesel is Rs. " + rateDiesel);
            System.out.println();
        }
    }
    float hikePetrol() {
        ratePetrol = (ratePetrol * 0.1f) + ratePetrol;
        return ratePetrol;
    }
    float hikeDiesel() {
        rateDiesel = (rateDiesel * 0.1f) + rateDiesel;
        return rateDiesel;
    }
    void showRate(float a1, float b1) {
        System.out.println("Now value of petrol is Rs. " + a1);
        System.out.println("Now value of diesel is Rs. " + b1);
    }
}
public class p5 {
    static float finalPetrol = 0;
    static float finalDiesel = 0;
    public static void main(String[] args) {
        Fuel f1 = new Fuel(20f, 10f);
        finalPetrol = f1.hikePetrol();
        finalDiesel = f1.hikeDiesel();
        Fuel f2 = new Fuel(finalPetrol, finalDiesel);
        finalPetrol = f2.hikePetrol();
        finalDiesel = f2.hikeDiesel();
        Fuel f3 = new Fuel(finalPetrol, finalDiesel);
        finalPetrol = f3.hikePetrol();
        finalDiesel = f3.hikeDiesel();
        Fuel f4 = new Fuel(finalPetrol, finalDiesel);
        finalPetrol = f4.hikePetrol();
        finalDiesel = f4.hikeDiesel();
        Fuel f5 = new Fuel(finalPetrol, finalDiesel);
        finalPetrol = f5.hikePetrol();
        finalDiesel = f5.hikeDiesel();
        f5.showRate(finalPetrol, finalDiesel);
    }
}