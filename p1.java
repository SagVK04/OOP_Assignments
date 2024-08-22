import java.util.Scanner;
class p1{
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        if(num % 2 == 0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }
}