package com.learn.java.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (s) -> s.concat("DEFAULT");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Java8"));
    }

}
