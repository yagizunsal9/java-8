package com.LearnJava.functionInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);
    static BinaryOperator<Integer> binaryOperator = (a,b) -> a*b ;
    static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
    static BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);


    public static void main(String[] args) {

        System.out.println(binaryOperator.apply(3,4));

        System.out.println("Result of MaxBy is : " + maxBy.apply(5,6));

        System.out.println("Result of MinBy is : " + minBy.apply(5,6));
    }
}
