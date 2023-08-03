package day3;

import java.io.*;
import java.util.*;

public class DemoException {
    public static void main(String[] args){
        int a=12;
        int b=0;
        //exception occurs
        //System.out.println(a/b);
        //Therefore, exception must be handled

        //try catch block inside function
        try{
            System.out.println(a/b);
            FileReader f=new FileReader("path of file");
            //throw IOException;

        }
        catch(ArithmeticException e)
        {
                System.out.println("Arithmetic Eexception Occurred");
                //e.printStackTrace();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
        }
        catch(Exception e)
        {
            System.out.println("Unknown exception");
        }
        finally {
            System.out.println("PRINT ANYWAY");
        }



        //print();
    }

    //throws with function definition
    public static void print()throws IOException //FileNotFoundException
    {
        throw new IOException();
        //Scanner sc=new Scanner(System.in);
        //without IOException I can enter a string to int and get an error
        //int i=sc.nextInt();

        //FileReader k=new FileReader("path of file");
    }
}
