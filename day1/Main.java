package day1;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


//List of smartphones. Find smartphones with ram 8gb or screen size>1.5?

import javax.xml.namespace.QName;
import java.util.*;
public class Main {
    public static void main(String[] args){
        System.out.println("Collection");
        SmartPhone samsungs23=new SmartPhone("Samsung S23","android",16,256, 9.5);
        SmartPhone apple14=new SmartPhone("Apple iPhone 14", "iOS",16,256, 8.5);
        SmartPhone samsunga50=new SmartPhone("Samsung A50","android",16,256, 5.5);
        SmartPhone apple13mini=new SmartPhone("Apple iPhone 13 Mini", "iOS",8,128, 4);
        SmartPhone apple13min=apple13mini;   //duplicate
        SmartPhone samsungs23d=samsungs23;  //duplicate
        SmartPhone ex=new SmartPhone("Apple iPhone 13 Mini", "iOS",8,128, 4);

        //ArrayList
        List<SmartPhone> smartphones=new ArrayList<>();
        smartphones.add(samsunga50);
        smartphones.add(samsungs23);
        smartphones.add(apple14);
        smartphones.add(apple13mini);
        System.out.println("Smartphones with RAM>8GB:");
        for(SmartPhone smartphone: smartphones)
        {
            if(smartphone.ram>8)
            {
                System.out.println(smartphone.name+":"+smartphone.ram);
            }
        }
        System.out.println("Smartphones with screen size>4.5:");
        for(SmartPhone smartphone: smartphones)
        {
            if(smartphone.screen>8)
            {
                System.out.println(smartphone.name+":"+smartphone.screen);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //checking if objects are equal using equals() function. equals() is called by an object therefore, it is a member function and defined in class Smartphone
        System.out.println("Are apple13mini and apple13 min equal?");
        if(apple13mini.equals(apple13min))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }

        System.out.println("Are apple13mini and ex min equal?");
        if(apple13mini.equals(ex))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not equal");
        }

        //create HashSet of smartphones
        Set<SmartPhone> sphones=new HashSet<>();

        sphones.add(samsunga50);
        sphones.add(samsungs23);
        sphones.add(apple14);
        sphones.add(apple13mini);

        //two duplicate objects are added into the HashSet
        sphones.add(apple13min);
        sphones.add(samsungs23d);
        sphones.add(ex);

        for(SmartPhone smartphone: sphones)
        {
            System.out.println(smartphone.name);
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        //Create a map of smartphones and find out if a S23 and 14Pro are present in the map. If yes, print the smartphone configuration. (Hint: Use containsKey method)
        Map<String, SmartPhone> sp=new HashMap<>();
        sp.put("S23",samsungs23);
        sp.put("14Pro",apple14);
        sp.put("A50",samsunga50);
        sp.put("13Mini",apple13mini);

        for(String s:sp.keySet())
        {
            if(s.equals("S23"))
            {
                System.out.println("S23 is present");
                System.out.println(sp.get(s).name);
                System.out.println(sp.get(s).screen);
                System.out.println(sp.get(s).os);
                System.out.println(sp.get(s).cam);
                System.out.println(sp.get(s).ram);
                System.out.println(sp.get(s).storage);
                System.out.println();
            }

            else if(s.equals("14Pro"))
            {
                System.out.println("14Pro is present");
                System.out.println(sp.get(s).name);
                System.out.println(sp.get(s).screen);
                System.out.println(sp.get(s).os);
                System.out.println(sp.get(s).cam);
                System.out.println(sp.get(s).ram);
                System.out.println(sp.get(s).storage);
                System.out.println();
            }
        }


    }
}