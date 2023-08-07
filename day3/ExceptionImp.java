package day3;

import java.util.*;

public class ExceptionImp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        //arithmetic exc caught
        try{
            if(b==0)
                throw new DivorFileException("Number cannot be divided by zero :(");
        }
        catch(DivorFileException e)
        {
            System.out.println(e.getMessage());
            System.out.println("Enter b again:");
            b=sc.nextInt();
        }
        System.out.println("a/b="+(a/b));
    }
}
