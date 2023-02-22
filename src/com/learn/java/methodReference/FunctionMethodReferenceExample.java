package com.learn.java.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

//    static Function<String, String> toUppercase = (s) -> s.toUpperCase();
    static Function<String, String> toUppercase = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUppercase.apply("leetcode"));
    }

}
