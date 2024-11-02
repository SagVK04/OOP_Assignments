import java.util.Scanner;
class p3{
    public static void main(String[] args) {
        System.out.print("Enter range of n:");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt(); int count = 0;
        System.out.println("The prime numbers are:");
        for(int i=1; i<=n; i++){
            if(prime(1,i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("No of prime numbers between 1 to "+n+" is: "+count);
    }
    public static boolean prime(int a, int b){
        for(int i=a+1; i<=b/2; i++){
            if(b%i == 0)
                return false;
        }
        return true;
    }
}