package com.learn.java.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
        System.out.println(binaryOperator.apply(12,3));
        BinaryOperator<Integer> max = BinaryOperator.maxBy(comparator);
        System.out.println("MaxBy is : "+max.apply(12, 100));
        BinaryOperator<Integer> min = BinaryOperator.minBy(comparator);
        System.out.println("MinBy is : "+max.apply(12, 100));
    }

}
