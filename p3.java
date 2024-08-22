import java.util.Scanner;
class p3{
    public static void main(String[] args) {
        System.out.print("Enter range of n:");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt(); 
        System.out.println("The prime numbers are:");
        for(int i=1; i<=n; i++){
            if(prime(1,i))
                System.out.println(i);
        }
    }
    public static boolean prime(int a, int b){
        for(int i=a+1; i<=b/2; i++){
            if(b%i == 0)
                return false;
        }
        return true;
    }
}