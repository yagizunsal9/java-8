package com.LearnJava.functionInterfaces;

import java.util.function.Function;

public class FunctionExample {

    static Function<String,String> function = (name) -> name.toUpperCase();

    static Function<String,String> addSomeString = (name) -> name.concat("default");

    public static void main(String[] args) {

        System.out.println("Result is : " + function.apply("java8"));

        System.out.println("Result of andThen : " + function.andThen(addSomeString).apply("java8"));

        System.out.println("Result of andThen : " + function.compose(addSomeString).apply("java8"));//we can use n number of compose and andthen methods in same line there is no limit

    }

}
