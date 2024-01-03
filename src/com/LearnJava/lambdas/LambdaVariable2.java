package com.LearnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {
    //static int value = 4; if we define like that we can use it in lambda expression
    public static void main(String[] args) {

        int value = 4; //local variable

        Consumer<Integer> c1 = (i) -> {
            //value++; we cant use this because we cannot modify local value in lambda expression
            //if we want to modify in lambda we should define it out of the method ans make it static
            System.out.println(value+i);
        };
        c1.accept(4);
    }
}
