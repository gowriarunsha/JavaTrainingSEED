package day1;

import java.util.*;
public class Rainbow {
    public static void main(String[] args) {
        List<String> rainbow=new ArrayList<>();
        String[] x={"Violet", "Indigo","Blue", "Green","Yellow","Orange","Red"};
        for(int i=0;i<7;i++){
            rainbow.add(x[i]);
        }
/*
        rainbow.add("Violet");
        rainbow.add("Indigo");
        rainbow.add("Blue");
        rainbow.add("Green");
        rainbow.add("Yellow");
        rainbow.add("Orange");
        rainbow.add("Red");
*/
        System.out.println("Last Colour:"+rainbow.get(rainbow.size()-1));
        //rainbow.remove(3);
        //rainbow.add(3,"Purple");
        rainbow.set(3,"Purple");
        System.out.println(rainbow);

    }
}
