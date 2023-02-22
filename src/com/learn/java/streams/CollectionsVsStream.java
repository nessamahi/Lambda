package com.learn.java.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStream {

    public static void main(String[] args) {
        //you can modify the collection but not stream
        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("dany");
        names.add("phoebe");

        names.remove(0);
        System.out.println(names);

        //you can traverse collections as many time as you want
        for(String name : names){
            System.out.println(name);
        }
        for(String name : names){
            System.out.println(name);
        }

        //but you can traverse stream only onetime

        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
        nameStream.forEach(System.out::println);

    }

}
