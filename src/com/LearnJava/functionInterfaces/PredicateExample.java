package com.LearnJava.functionInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> p = (i) -> {return i%2==0;};
    static Predicate<Integer> p1 = (i) -> i%5==0;

    public static void predicateAnd(Integer a){

        System.out.println("Predicate And result is: "+ p.and(p1).test(a));

    }

    public static void predicateOr(Integer a){

        System.out.println("Predicate Or result is: "+ p.or(p1).test(a));

    }

    public static void predicateNegate(Integer a){

        System.out.println("Predicate Negate result is: "+ p.or(p1).negate().test(a));

    }

    public static void main(String[] args) {

         System.out.println(p.test(4));

         System.out.println(p1.test(4));

         predicateAnd(10);
         predicateAnd(20);
         predicateAnd(4);

         predicateOr(10);
         predicateOr(20);
         predicateOr(3);
         predicateOr(4);

         predicateNegate(10);
         predicateNegate(20);
         predicateNegate(3);
         predicateNegate(4);
    }

}
