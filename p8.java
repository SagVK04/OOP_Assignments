import java.util.*;
class BalanceRangeException extends Exception{
    BalanceRangeException(String msg){
        System.out.println(msg);
    }
}
class SavingAccount{
    double acNo,balance; String name;
    SavingAccount(double a, double b, String n){
        acNo = a; balance = b; name = n;
    }
}
class p8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: "); String n = sc.next();
        System.out.println("Enter Account Number: "); int a = sc.nextInt();
        System.out.println("Enter Balance: "); double b = sc.nextDouble();
        SavingAccount S = new SavingAccount(a,b,n);
        try{
            System.out.println("Checking eligibility.....");
            checkBalance(S.balance);
        }
        catch(Exception e){
            System.out.println("Exception is: "+e);
        }
    }
    static void checkBalance(double val) throws BalanceRangeException{
        if(val>=500)
            System.out.println("Eligible for withdrawal!");
        else
            throw new BalanceRangeException("Not enough balance! You cannot withdraw....");
    }
}