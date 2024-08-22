import java.util.Scanner;
class p8{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter row:");
        int a = sc1.nextInt(); 
        System.out.print("Enter column:");
        int b = sc1.nextInt();
        int[][] arr1 = new int[a][b];
        int[][] arr2 = new int[a][b];
        System.out.println("Taking input for 1st matrix...");
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                arr1[i][j] = sc1.nextInt();
            }
        }
        System.out.println("Taking input for 2nd matrix...");
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                arr2[i][j] = sc1.nextInt();
            }
        }
        System.out.println("Adding 2 matrices...");
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                arr1[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("Printing resultant matrix:");
        for(int i = 0; i<a; i++){
            for(int j = 0; j<b; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}