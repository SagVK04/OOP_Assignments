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
    void withdraw(int amount) throws BalanceRangeException{
        if(balance > amount && balance >=500 ){
            balance -=amount;
            System.out.println("Withdrawal successful! Total balance Rs. "+balance);
        }
        else
            throw new BalanceRangeException("Withdrawal denied!");
    }
    void deposit(int amount){
        balance +=amount;
        System.out.println("Deposit successful! Total balance Rs. "+balance);
    }
    void viewBalance(){
        System.out.println(balance);
    }
}
class p8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: "); String n = sc.next();
        System.out.println("Enter Account Number: "); int a = sc.nextInt();
        System.out.println("Enter Balance: "); double b = sc.nextDouble();
        SavingAccount S = new SavingAccount(a,b,n);
        System.out.println("Enter amount to withdraw:"); int amount = sc.nextInt();
        try{
            System.out.println("Checking eligibility.....");
            S.withdraw(amount);
        }
        catch(Exception e){
            System.out.println("Exception is: "+e);
        }
        System.out.println("Enter amount to deposit:"); int amount1 = sc.nextInt();
        S.deposit(amount1);
        S.viewBalance();       
    }
}