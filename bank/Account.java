package bank;

import java.util.*;

public class Account{
    int accno;
    String type;
    double balance;
    //static int generator=1;
    Account(long generator)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("CREATING ACCOUNT....\n");
        System.out.println("Account type:");
        this.type=sc.nextLine();
        //generating account number
        //accNoGenerate();
        //this.accno= new Random(generator+(int)(this.type.charAt(0))).nextInt(10000000);
        this.accno= new Random(generator).nextInt(10000000);
        this.balance=0;
        System.out.println("Account successfully created!!");
    }

    public double viewBalance()
    {
        return balance;
    }
    public double debit(double amount)
    {
        balance=balance-amount;
        return balance;
    }
    public double deposit(double amount)
    {
        balance=balance+amount;
        return balance;
    }

}
