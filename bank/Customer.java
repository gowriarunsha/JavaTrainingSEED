package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

//DEFAULT because only classes in the same package shpuld access

//customer can extend Account
class Customer{
    long custID;
    String name;
    List<Account> accounts; //non static as each customer should have diff list of accounts
    String address;
    long mobile;
    static long generator=1;
    double totalCustomerBalance;

    //TEST
//    Customer(String name,String address, long mobile, long accno,String type,double balance)
//    {
//        this.name=name;
//        this.address=address;
//        this.mobile=mobile;
//        custIDGenerate();
//    }

    //create new customer
    Customer()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO NOTHDFC BANK!!!\n\nCreate a new account with us. Please provide your details:");
        System.out.println("Enter full name, address and mobile number:");
        this.name=sc.nextLine();
        this.address=sc.nextLine();
        this.mobile=sc.nextLong();
        //this.custID=new Random().longs(10000000, (99999999 + 1)).limit(1).findFirst().getAsLong();
        this.custID= new Random(this.mobile).nextInt(10000000);
        accounts=new ArrayList<>();
        //new account created by default
        //newAccount();

        int choice=1;
        do
        {
            switch (choice) {
                case 1:
                    newAccount();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println("\n\nDo you want to start another account(0/1)?\n\n1. yes\n0. no\nEnter your choice:");
            choice = sc.nextInt();
        }while(choice!=0);
    }

    void newAccount()
    {
        System.out.println();
        accounts.add(new Account(generator));
        generator++;
    }
    public void print()
    {
        System.out.println("\nCustomer ID:"+custID+"\t\tName:"+name+"\nAddress:"+address+"\nMobile Number:"+mobile);
        System.out.println("Accounts opened");
        //or stream
        for (Account account : accounts) {
            System.out.println("Account number:"+account.accno+"\tAccount type:"+account.type+"\tBalance:"+account.balance);
        }
    }
    public double viewAccBalance(int acc)
    {
        return accounts.stream().filter(x->x.accno == acc).mapToDouble(x->x.balance).findAny().getAsDouble();
    }

    public void debitc(int acc,double amount)
    {
        accounts.stream().filter(x->x.accno==acc).findAny().get().debit(amount);
    }

    public void creditc(int acc,double amount)
    {
        accounts.stream().filter(x->x.accno==acc).findAny().get().deposit(amount);
    }

    public void updateAdd()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter new address:");
        address=sc.nextLine();

    }
    public boolean BalanceMill()
    {
        double bal= accounts.stream()
                .mapToDouble(x->x.balance)
                .reduce(0.0,(acc,e)->acc+e);

        if(bal>1000000)
            return true;
        else
            return false;

    }
    public boolean Million()
    {
        return accounts.stream()
                .anyMatch(x->x.balance>1000000);
    }


}
