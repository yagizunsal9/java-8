package com.LearnJava.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsMinMaxExample {

    static List<Integer> integerList = Arrays.asList(6,7,8,9,10);

    public static int findMaxValue(){
        return integerList.stream()
                .reduce(0, (x,y) -> x>y ? x : y);

    }
    public static void main(String[] args) {

    int maxValue= findMaxValue();
        System.out.println("max value is : "+ maxValue);


    }
}
