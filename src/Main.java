import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Hello World");
        System.out.print("Hello World\n");
        System.out.print("Sagnik Metiya!\n");
        //Variables
        /*
        //Primitive Datatypes
        //byte - 1 [-128 to 127]
        //short - 2
        //int - 4
        //long - 8
        //float - 4
        //double - 8
        //char - 2
        //boolean - 1
        byte age1 = 30;
        int phone = 1234567890;
        long phone2 = 12345678900L;
        float pi= 3.14F;
        char letter = '@';
        boolean isAdult = true;
         */
        //Non-Primitive Datatypes
        String name = new String("Henrix Acoustic");
        String friend = new String("Intern Acoustic");
        System.out.println(name);
        System.out.println(friend);
        System.out.println(name.length());
        System.out.println(friend.length());
        /*Concatenate*/
        String name1 = "Sagnik";
        String name2 = "Metiya";
        System.out.println(name1 + " " +  name2);
        /*charAt*/
        String name3 = "Sagnik";
        System.out.println(name3.charAt(5));
        /*Length*/
        System.out.println(name3.length());
        /*Replace*/
        String name4 = name3.replace('k','c');
        System.out.println(name4);
        /*Substring*/
        String name5 = ("I love Aeishika, Arijita, Sujata, Alexandra");
        System.out.println(name5.substring(0,25));
        //Arrays
        int[] marks = new int[3];
        marks[0] = 97; marks[1] = 98; marks[2] = 95;
        /*Length of array*/
        System.out.println(marks.length);
        /*Sorting*/
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        /*Static Array Decalaration*/
        int[] marks1 = {97,98,95};
        int[][] marks2 = {{97,98,95},{95,95,98}};
        System.out.println(marks2[1][2]);
        //Casting
        /*Implicit Casting*/
        double price = 100.00;
        double finalprice = price + 18;
        System.out.println(finalprice);
        /*Explicit Casting*/
        int p = 100;
        int fp = p + (int)18.0;
        System.out.println(fp);
        //Constant
        float pi = 3.14F;/*Not constant*/
        final float PI1 = 3.14F;/*Constant*/
        //Operators
        /*Arithmetic Operators
        sum, subtract, multiply, divide, modulo,increment,decrement,assignment
        */
        /*Maths Class*/
        System.out.println(Math.max(5,8));/*Prints max no. between two*/
        System.out.println((int)(Math.random()*100));/*Prints a random value between  0.00 & 1.00*/
        /*Taking input*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sgpa:");
        float sgpa = sc.nextFloat();
        System.out.print("Your Sgpa is:");
        System.out.println(sgpa);
        /*System.out.print("Enter your Name:");
        String name7 = sc.next();/*Takes only a word as input
        System.out.print("Your name is:");
        System.out.println(name7);
        */
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your Name:");
        String str = sc1.nextLine();
        System.out.println(str);
        /* Comparison Operators
        equal to(==), not equals to(!=), greater than(>), less than(<)
        */
        /*Conditional Statements*/
        boolean isSunUp = true;
        if(isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("Night");
        int age1 = 30;
        if(age1 >= 18)
            System.out.println("Can vote");
        else
            System.out.println("Can't vote");
        /*Logical Operators*/
        int x = 30; int y = 40;
        if(x < 50 && y<50)
            System.out.println("Both less than 50");
        else
            System.out.println("Both are not less than 50");
        //OR( || ), NOT( ! )

    }
}