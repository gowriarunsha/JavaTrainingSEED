package day3;

import java.io.*;

public class Ex {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        //exception occurs
        //System.out.println(a/b);
        //Therefore, exception must be handled

        //try catch block inside function
        try {
            System.out.println(a / b);
            FileReader f = new FileReader("path of file");
            throw new Exception();
            //catches only the first error

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred");
            //e.printStackTrace();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
        } catch (Exception e) {
            System.out.println("Unknown exception");
        } finally {
            System.out.println("PRINT ANYWAY");
        }


        //new try
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("Caught in main()");
        }

    }
}