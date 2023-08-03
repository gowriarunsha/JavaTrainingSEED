package day3;
import day3.DivorFileException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.module.FindException;
import java.util.*;

public class ExceptionImp {
    public static void main(String[] args)throws DivorFileException{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //arithmetic exc caught
        try{
            System.out.println(a/b);
        }
        catch (ArithmeticException e)
        {
            throw new DivorFileException("Number cannot be divided by zero :(");
        }
        //filereader exc caught
        try {
            FileReader f=new FileReader("DivorFileException");
        } catch (FileNotFoundException e) {
            throw new DivorFileException("File Not Found :(");
        }

        //throw new ArithmeticException();
        //throw new FileNotFoundException();

    }
}
