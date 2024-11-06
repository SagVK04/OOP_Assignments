import testPF.*;
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); d = sc.nextInt();
        Prime p = new Prime(d); Factorial f = new Factorial(); f.findFact(d);
    }
}
