import java.util.Scanner;
class p7{
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Solving  a quadratic equation of x...");
        System.out.print("Enter co-efficient of x^2:");
        double a = sc1.nextDouble(); 
        System.out.print("Enter co-efficient of x:");
        double b = sc1.nextDouble(); 
        System.out.print("Enter constant:");
        double c = sc1.nextDouble(); 
        double det = (b*b) - (4*a*c);
        if(det > 0){
            System.out.println("First root: "+((-b + Math.sqrt(det)) / (2*a) ));
            System.out.println("Second root: "+((-b - Math.sqrt(det)) / (2*a) ));
        }
        else if (det == 0) {
            System.out.println("Only root: "+(-b / (2*a)));
        }
        else
            System.out.println("No real root at all...");
    }
}