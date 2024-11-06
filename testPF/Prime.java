package testPF;
public class Prime {
    public int d,i,flag=0;
    public Prime(int d){
        for(i=2;i<=d/2;i++){
            if(d%i == 0)
                flag++;
        }
        if(flag == 0)
            System.out.println("This is prime");
        else
            System.out.println("This is not prime");
    }
}