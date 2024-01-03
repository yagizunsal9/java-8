package com.LearnJava.lambdas;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {

        int i = 0;

        Consumer<Integer> c1 = (i1) -> { //we cant assign i in lambda because in same method we use it, we cannot use it twice or more
            System.out.println("Value is : "+i1);
        };
    }
}
