package com.LearnJava.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        //PRIOR JAVA 8

        Comparator<Integer> comparator = new Comparator<Integer>(){
             public int compare(Integer o1, Integer o2){
                 return o1.compareTo(o2); // 0 -> o1==o2
                                          // 1 -> o1>o2
                                          //-1 -> o1<o2
            }

        };

        System.out.println("Result of the comparator is:" + comparator.compare(3,2));

        //USING LAMBDA

        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);

        System.out.println("Result of the comparator using Lambda is:" + comparatorLambda.compare(1,1));

        Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);

        System.out.println("Result of the comparator using Lambda is:" + comparatorLambda1.compare(1,1));
    }
}
