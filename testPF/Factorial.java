package testPF;
public class Factorial {
    public int d,fact=1;
    public void findFact(int d){
        if(d == 0)
            System.out.println("Factorial is: 1");
        else{
            for(int i=1;i<=d;i++)
                fact = fact * i;
            System.out.println("Factorial is: "+fact);
        }
    }
}