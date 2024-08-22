import java.util.Scanner;
class p6{
    public static void main(String[] args) {
        System.out.print("Enter a digit:");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt(); 
        System.out.print("Factorial of "+n+" : "+fact(n));
    }
    public static int fact(int n){
        if(n == 0 || n == 1)
            return 1;
        return (n * fact(n-1));
    }
}