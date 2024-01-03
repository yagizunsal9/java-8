package com.LearnJava.numericstreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {
    static IntStream intStream = IntStream.range(1,50);
    public static void main(String[] args) {


        System.out.println("Range Count is : "+intStream.count());

        IntStream.range(1,50).forEach((value -> System.out.println("Range Count "+value+",")));

        System.out.println("Range Closed Count is : "+IntStream.rangeClosed(1,50).count());

        IntStream.rangeClosed(1,50).forEach((value -> System.out.println("Range Closed Count "+value+",")));

        System.out.println("LongStream Range Closed Count is : "+ LongStream.rangeClosed(1,50).count());

        LongStream.rangeClosed(1,50).forEach((value -> System.out.println("LongStream Range Closed Count "+value+",")));

        IntStream.range(1,50).asDoubleStream().forEach((value -> System.out.println("DoubleStream Range  Count "+value+",")));

    }

}
