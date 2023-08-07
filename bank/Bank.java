package bank;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Bank{
//COULD MAKE EVERYTHING PROTECTED CAUSE ITS IN SAME PACKAGE
//public Bank() if multiple banks

    //list of all customers
    static List<Customer> customers;    //static as there is one whole list of customers for the bank and main is static

    public static void newCustomer()
    {
        customers.add(new Customer());
    }
    public static void printAllCustomerDetails()
    {
        for(Customer customer:customers)
        {
            customer.print();
        }
    }
    public static void CustomerFunctions()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer ID:");
        int s=sc.nextInt();
        Customer c=customers.stream().filter(x->x.custID==s).findAny().get();
        System.out.println(c);
        if(customers.stream().filter(x->x.custID==s).count()==0)
        {
            System.out.println("Invalid Customer ID");
            return;
        }
        int choice;
        int acc;
        double amount;

        do{
            System.out.println("\n\nWELCOME "+c.name+"\n\n What do you want to do today?\n1. Debit\n2. Credit\n3. Check balance\n4. Update Address\n5. View your accounts\n0. exit\nEnter your choice:");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter account number to debit from:");
                    acc=sc.nextInt();
                    System.out.print("Enter amount:");
                    amount=sc.nextDouble();
                    c.debitc(acc,amount);
                    break;
                case 2:
                    System.out.print("Enter account number to credit to:");
                    acc=sc.nextInt();
                    System.out.println("Enter amount:");
                    amount=sc.nextDouble();
                    c.creditc(acc,amount);
                    break;
                case 3:
                    System.out.print("Check balance. Enter account number:");
                    acc=sc.nextInt();
                    double bal=c.viewAccBalance(acc);
                    System.out.println("Account Balance:"+bal);
                    break;
                case 4:
                    c.updateAdd();
                    System.out.println("Account address updated.");
                    break;
                case 5:
                    System.out.print("Your accounts:");
                    c.print();
                    break;
                case 0:
                    System.out.println("Thank you for using NOTHDFC!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while(choice!=0);
    }

    public static void MultipleCheck()
    {
        List<Customer> multiple=customers.stream()
                .filter(x->x.accounts.size()>1).collect(Collectors.toList());
        if(multiple.size()==0)
        {
            System.out.println("No customers with multiple accounts!");
        }
        else{
            System.out.println("Customers with multiple accounts:");
            multiple.stream().map(x->x.name)
                    .forEach(System.out::println);
        }
    }
    public static void PlatinumCust()
    {
        List<Customer> plat=customers.stream().filter(x->x.Million()).collect(Collectors.toList());
        if(plat.size()==0)
        {
            System.out.println("No customers with more than 1 million in single account");
        }
        else{
            System.out.println("Customers with more than 1 million in single account:");
            plat.stream().map(x->x.name)
                    .forEach(System.out::println);
        }
    }
    public static void PremiumCust()
    {
        List<Customer> prem=customers.stream().filter(x->x.BalanceMill()).collect(Collectors.toList());
        if(prem.size()==0)
        {
            System.out.println("No customers with more than 1 million.");
        }
        else{
            System.out.println("Customers with more than 1 million:");
            prem.stream().map(x->x.name)
                    .forEach(System.out::println);
        }
    }

    public static void main(String[] args){

        customers=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int choice;
        long noOfCustomers;
        //create BANK do only once
        //Bank b=new Bank();
        //loop bank functions
        do{
            System.out.println("\n\nWELCOME TO NOTHDFC BANK!\n\n What do you want to do today?\n1. Create Customer\n2. Get information of all customers\n3. Open new account for existing customer\n4. Customer Login\n5. Customers with more than one accounts\n6. Customers with more than 1 million in one account\n7. Customers with more than 1 million in all accounts\n0. exit\nEnter your choice:");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    newCustomer();
                    break;
                case 2:
                    printAllCustomerDetails();
                    noOfCustomers=customers.size();
                    System.out.println("\nNumber of cutomers:"+noOfCustomers);
                    break;
                case 3:
                    System.out.println("Enter customer ID:");
                    Long s=sc.nextLong();
                    Predicate<Customer> isCustomer=(c)->c.custID==s;
                    //new account for existing customer
                    long count=customers.stream().filter(isCustomer).peek(Customer::newAccount).count();
                    if(count==0)
                    {
                        System.out.println("Invalid Customer ID!");
                    }
                    break;
                case 4:
                    CustomerFunctions();
                    break;
                case 5:
                    System.out.println("List of customers with more than one accounts:");
                    MultipleCheck();
                    break;
                case 6:
                    System.out.println("List of customers with more than 1 million in one account:");
                    PlatinumCust();
                    break;
                case 7:
                    System.out.println("List of customers with more than 1 million in all accounts:");
                    PremiumCust();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Choice not valid!");
            }
        }while(choice!=0);

    }
}
