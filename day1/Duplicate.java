package day1;

import java.util.Set;
import java.util.HashSet;
public class Duplicate {
    public static void main(String[] args) {
        char[] x={'A','v','d','a','d','f','g','r','c','v','g','D','d','e','g'};
        Set<Character> set=new HashSet<>();
        for(int i=0;i<x.length;i++)
        {
            set.add(x[i]);
        }
        System.out.println(set);
    }
}
