package day3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ExceptionImp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //arithmetic exc caught
        try{
            if(b==0)
                throw new DivorFileException("Number cannot be divided by zero :(");
            System.out.println(a/(double)b);
        }
        catch(DivorFileException e)
        {
            System.out.println(e.getMessage());
        }
        //filereader exc caught
        try {
            FileReader f=new FileReader("DivorFileException");

        } catch (FileNotFoundException e) {
            //throw new DivorFileException("File Not Found :(");
        }

        //throw new ArithmeticException();
        //throw new FileNotFoundException();

    }
}
