/*Create an abstract class Accounts with the following details: 
Data Members: (a)
account Number (b) account Holder Name (c) Mobile (d) Balance, 
Methods: (a) withdrawal() - abstract, (b) deposit() - abstract (c) display(): to print all details of the
account holder. 
Create SavingsAccount subclass of Account class and display details
of the saving account holder after withdraw or deposit of certain amount. 
In Saving Account class: 
Data Member: amount [read amount to be deposit / withdraw]
Methods: implements withdrawal() & deposit() to update the balance considering the
		 restriction that the balance must not be negative after withdrawal and overrides
		 display() method to display account details along with modified balance.*/

import java.util.*;
abstract class Accounts{
	int acno; String acname; String mob; int balance=0;
	abstract void withdrawal(int a);
	abstract void deposit(int b);
	abstract void display(int c);
}
class SavingsAccount extends Accounts{
	SavingsAccount(int n, String an, String m){
		acno = n; acname = an; mob = m;
	}
	void withdrawal(int a){
		if(balance <= 0)
			System.out.println("You have not enough balance!");
		else{
			if(balance > a){
				balance -= a;
				display(balance);
			}
			else
				System.out.println("This is not a valid amount....");
		    }
	}
	void deposit(int b){
		balance += b;
        display(balance);
        }
	void display(int b){
		System.out.println("A/c no: "+acno);
		System.out.println("Name: "+acname);
		System.out.println("Mobile No: "+mob);
		System.out.println("Balance: "+balance);
	}
}
public class p3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter account number: "); int a = sc.nextInt();
		System.out.println("Enter account name: "); String n = sc.next();
		System.out.println("Enter mobile no: "); String m = sc.next();
		SavingsAccount s1 = new SavingsAccount(a,n,m);
		System.out.println("Enter amount to deposit: "); int da = sc.nextInt(); System.out.println(); s1.deposit(da);
		System.out.println();
		System.out.println("Enter amount to withdraw: "); int wa = sc.nextInt(); System.out.println(); s1.withdrawal(wa);
		System.out.println();
	}
}
