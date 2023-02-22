package com.learn.java.lambdas;

import java.util.function.Consumer;

public class LambdaVariables {

    public static void main(String[] args) {
        int i = 0;
        int value = 4;

//        Consumer<Integer> c1 = (i) -> System.out.println(i);
//    }
        Consumer<Integer> c2 = (j) -> {
//            value++;
            System.out.println(value + j);
        };
        c2.accept(4);

    }
}
