package com.LearnJava.functionInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOpretarorExample {

    static UnaryOperator<String> unaryOperator = (s) -> s.concat("Default");

    public static void main(String[] args) {

        System.out.println(unaryOperator.apply("java8"));

    }
}
