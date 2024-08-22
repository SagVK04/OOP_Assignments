import java.util.Scanner;
class p2{
    public static void main(String[] args) {
        System.out.print("Enter range of:");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt(); int[] a = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            System.out.print("Enter "+i+" element: ");
            a[i] = sc1.nextInt();
        }
        int max = a[0]; int min = a[0];
        for(int j=0;j<n; j++){
            if(a[j] > max)
                max = a[j];
            if(a[j] < min)
                min = a[j];
        } 
        System.out.println(max+" is the max element of array...");
        System.out.println(min+" is the min element of array...");
    }
}