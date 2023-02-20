package com.learn.java.functionalInterfaces;

public class FunctionExample1 {

    public static String perform(String str){
        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {
        String result = perform("Hello");
        System.out.println("Result is : " +result);
    }

}
