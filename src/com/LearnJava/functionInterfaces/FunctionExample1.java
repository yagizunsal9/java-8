package com.LearnJava.functionInterfaces;

public class FunctionExample1 {

    public static String performConcat(String str){

       return FunctionExample.addSomeString.andThen(FunctionExample.function).apply(str); // first add default and then make uppercase the string
    }

    public static void main(String[] args) {

        String result = performConcat("Hello");

        System.out.println("Result is : " +result);//print out the resut
    }

}
