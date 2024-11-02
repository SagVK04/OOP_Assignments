/*Write a java program to Count Total Number of Objects
Created for a Class. [use of static variable and method]*/

import java.util.*;
class countObjects {
    boolean isSuccess() {
        return true;
    }
}
public class p4 {
    static int sum = 0;
    public static void main(String[] args) {
        while (true) { 
            System.out.println("Enter 1 for create object, Enter 2 to show, Enter 3 to exit");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {
                case 1: createObj(sum); System.out.println("New Object created!"); break;
                case 2: System.out.println("No of objects: " + sum); break;
                case 3: System.out.println("Exited successfully...."); System.exit(input);
            }
        }
    }
    static void createObj(int s) {
        countObjects c1 = new countObjects();
        if (c1.isSuccess()) {
            sum++;
        }
    }
}
