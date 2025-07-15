package com.geeks.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    public static void main(String [] args)
    {
        List<String> List1 = new ArrayList<>();
        List1.add("Banglore");
        List1.add("Mumbai");
        List1.add("Chennai");
        System.out.println(List1);
        for(String s : List1)
            System.out.println(s);
        List1.add(1,"Hyderabad");
        System.out.println(List1);
        List1.set(0,"Bengaluru");
        System.out.println(List1);


    }
}
