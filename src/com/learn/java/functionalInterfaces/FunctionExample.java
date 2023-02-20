package com.learn.java.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {
    //here Function input is string and output is also string : Function<String, String>
    static Function<String, String> function = (name) -> name.toUpperCase();
    static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("GeeksForGeeks");

    public static void main(String[] args) {
        System.out.println("Result is : " +function.apply("leetcode"));
        System.out.println("Result is : " +function.andThen(addSomeString).apply("leetcode"));
        System.out.println("Result is : " +function.compose(addSomeString).apply("leetcode"));
    }
}
