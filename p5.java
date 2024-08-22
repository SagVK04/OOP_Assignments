import java.util.Scanner;
class p5{
    public static void main(String[] args) {
        System.out.print("Enter a digit:");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt(); 
        System.out.print("Fibonacci Series: ");
        for(int i=0; i<n; i++){
            System.out.print(findFib(i)+" ");
        }
    }
    public static int findFib(int n){
        if(n == 0 || n == 1)
            return n;
        return (findFib(n-1)+findFib(n-2));
    }
}