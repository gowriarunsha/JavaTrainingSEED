package day2;
import java.util.*;
public class ReduceDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        double[] number={2,4,6,8,10};
        //acc 0(defualt value fo int) accumulator, n is every number
        System.out.println(Arrays.stream(number)
                        .map(x->{
                            System.out.println(x);
                            return x;
                        })
                .reduce(0,(n,acc)->(n+acc)));

        //forEach works for ArrayList without using stream
        list.forEach(n->{System.out.println(n);});

    }
}
