import java.util.Scanner;
class p9{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter row:");
        int a = sc1.nextInt(); 
        System.out.print("Enter column:");
        int b = sc1.nextInt();
        int[][] arr1 = new int[a][b];
        int sum=0;
        System.out.println("Taking input for matrix...");
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                arr1[i][j] = sc1.nextInt();
            }
        }
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                if(arr1[i][j]%2 !=0)
                    sum += arr1[i][j];
            }
        }
        System.out.println("Printing sum of odd numbers in matrix: "+sum);
    }
}