package com.learn.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static int performMultiplication(List<Integer> integers){
       return integers.stream() // 1, 2, 5, 7
               //a=1 [default] b=1 [stream], result = 1
               //a=1 [previous result] b=3 [stream], result = 3
               //a=3 [previous result] b=5 [stream], result = 15.....
                .reduce(1, (a,b) -> a*b); //1 is default value, then is BiFunction, then we perform multiplication
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integers){
        return integers.stream() // 1, 2, 5, 7
                //a=1 [default] b=1 [stream], result = 1
                //a=1 [previous result] b=3 [stream], result = 3
                //a=3 [previous result] b=5 [stream], result = 15.....
                .reduce( (a,b) -> a*b); //1 is default value, then is BiFunction, then we perform multiplication
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(integers));
        Optional<Integer> res = performMultiplicationWithoutIdentity(integers);
        System.out.println(res.isPresent());
        System.out.println(res.get());
    }

}
