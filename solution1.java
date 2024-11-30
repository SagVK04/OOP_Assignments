import java.util.*;
public class solution1{
  public int sum = 0;
  public static void main(String[] args){
    System.out.println("Enter the binary string: ");
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();
    int[] arr = new int[a.length()]; int sum=0; char[] newArr = new char[a.length()];
    char[] resArr = new char[a.length()];
    for(int i=0;i<a.length();i++){
      System.out.println("Enter index" +i+" weight value: ");
      arr[i] = sc.nextInt();
    }
    for(int i=0;i<a.length();i++){
      newArr[i] = a.charAt(i);
    }
    for(int k=0;k<a.length();k++){
       if(k!=0 && newArr[k-1] == newArr[k]){
        if(arr[k] > arr[k-1])
          sum = sum + arr[k-1];
        else
          sum = sum + arr[k];
       }
       else
        resArr[k] = newArr[k];
    }
    System.out.println("Largest alternating string: ");
    for(int i=0;i<a.length();i++)
      System.out.println(resArr[i]);
  	System.out.println("Output weightage: "+sum);
  }
}