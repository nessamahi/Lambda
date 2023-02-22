package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

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

    public static Optional<Student> getHighestGPA(){
        return StudentDatabase.getAllStudents().stream()
                .reduce((s1,s2) -> s1.getGpa() > s2.getGpa() ? s1 : s2);
//                .reduce((s1,s2) -> {
//                    if(s1.getGpa() > s2.getGpa()){
//                        return s1;
//                    }
//                    else {
//                        return s2;
//                    }
//                });
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println(performMultiplication(integers));
        Optional<Integer> res = performMultiplicationWithoutIdentity(integers);
        System.out.println(res.isPresent());
        System.out.println(res.get());

        Optional<Student> studentOptional = getHighestGPA();
        if(studentOptional.isPresent()){
            System.out.println(studentOptional.get());
        }
    }

}
