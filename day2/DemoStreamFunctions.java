package day2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class DemoStreamFunctions {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //functions of stream()
        //INTERMEDIATE OP
        //map()
        //filter()
        //sorted()

        //TERMINAL OP
        //collect()
        //reduce()
        //forEach()

        Predicate<Integer> odd=x->x%2!=0;

        int sum=numbers.stream()
                .peek(x-> System.out.print(x+"\t"))     //doesnt change stream, just does some action
                .map(x->x*x)        //returns value to stream
                .filter(odd)        //filter predicate wont work on int, only on Integer stream object
                .filter(x->x<81)
                .mapToInt(x->x)     //converts stream object to int Integer stream object to int
                .map(x->x+2)
                .filter(x->x<81)        //filter stream based on predicate or write condition
                .sorted()       //sort the stream
                .limit(4)       //limit number of objects by variable
                .reduce(0,(acc,x)->acc+x);

        System.out.println();
        System.out.println(sum);


//1. Arrays to arrayList
//Arrays.asList(1,2,3);
//2. arrarList to Array
//employees.toArray();
//3. Stream to List
//Collectors.toList();

    }
}
