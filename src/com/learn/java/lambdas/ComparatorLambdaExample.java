package com.learn.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        //prior java 8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result : " +comparator.compare(3,2));

        //lambda way

        Comparator<Integer> comparatorlambda = (Integer a, Integer b) -> {
            return a.compareTo(b);
        };

        System.out.println("Result Lambda : " +comparator.compare(6,6));

        //you don't have to explicitly declare the type of lambda parameters
        Comparator<Integer> comparatorlambda1 = (a, b) -> {return a.compareTo(b);};
        System.out.println("Result : Without parameter type :" +comparatorlambda1.compare(6,9));

    }
}
