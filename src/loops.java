import java.util.Scanner;
public class loops {
    public static void main(String[] args){
        /*int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range of loop:");
        int n =sc.nextInt();
        for(i=0; i<n; i++)
        {
            System.out.print("I love Cassandra! ");
            System.out.println(i+1);
        }
        int j = n;
        while(j>=0)
        {
            System.out.println(j);
            j--;
        }*/
        int k =0;
        while(true)
        {
            if(k == 3)
            {
                k++;
                continue;
            }
            System.out.println(k);
            k++;
            if(k>5)
                break;
        }
    }
}
