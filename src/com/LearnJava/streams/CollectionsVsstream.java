package com.LearnJava.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsstream {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("adam");
        names.add("jim");
        names.add("jenny");



        names.remove(0);//removes first index

        System.out.println(names);

        //IN STREAM WE CANNOT ADD OR REMOVE
        Stream<String> namesStream= names.stream();
        namesStream.forEach(System.out::println);
       // namesStream.forEach(System.out::println); **cannot run stream more than one**

    }
}
