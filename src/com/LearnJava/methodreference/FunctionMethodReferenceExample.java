package com.LearnJava.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String,String> toUppercaseLambda = (s) -> s.toUpperCase();//eğer alt+enter basarsak direk lambda expressionu method expression yapabiliriz.

    static Function<String,String> toUppercaseMethodReference= String::toUpperCase;

    public static void main(String[] args) {

        System.out.println(toUppercaseLambda.apply("java8"));

        System.out.println(toUppercaseMethodReference.apply("java8"));

    }
}
