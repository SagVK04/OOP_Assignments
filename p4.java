import java.util.Scanner;
class p4{
    public static void main(String[] args) {
        System.out.print("Enter a digit:");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt(); 
        System.out.println("The sum is: "+printSum(n));
        System.out.println("Reverse is: "+reverseNum(0,n));
    }
    public static int printSum(int n){
        if(n == 0)
            return 0;
        return ( (n % 10) + printSum(n / 10) );
    }
    public static int reverseNum(int rev, int n){
        if(n == 0)
            return rev;
        rev = (rev*10) + (n%10);
        return ( reverseNum( rev, (n/10) ) );
    }
}