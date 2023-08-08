package day3;

// reads a list of numbers from a file
// throws a custom exception if any of the numbers are positive.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args)throws FileNotFoundException{
        Scanner sc=new Scanner(System.in);
        Scanner file;
        try{
            file=new Scanner(new File("/Users/gowri.arunsha/Documents/Training/CoreJava/src/day3/file.txt"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
            System.out.println("File not found.Enter correct file path:");
            String path=sc.nextLine();
            file=new Scanner(new File(path));
        }
            List<Integer> num=new ArrayList<>();
            while(file.hasNext())
            {
                try {
                if (file.nextInt() > 0) {
                    throw new PositiveException("Negative Number Found");
                }
            }
            catch(PositiveException e)
                {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
            }
            }
            //not necessary as Scanner is autoclosable
            //file.close();
            num.forEach(System.out::println);


    }

}
