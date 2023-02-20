package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> student = (name, activities) -> {
            System.out.println("Name : " +name+ ", Activities : " +activities);
        };

        List<Student> studentList = StudentDatabase.getAllStudents();

        studentList.forEach((student1 -> student.accept(student1.getName(), student1.getActivities())));
    }

    public static void main(String[] args) {
        //BiConsumer doesn't return any output, it only accepts input
        BiConsumer<String, String> biConsumer = (a,b) -> {
            System.out.println("Value : a " +a+ ", Value b : " +b);
        };

        biConsumer.accept("java7", "java8");

        BiConsumer<Integer, Integer> multiply = (a, b) -> {
            System.out.println("Multiplication is : " +(a*b));
        };

        BiConsumer<Integer, Integer> division = (a, b) -> {
            System.out.println("Division is : " +(a/b));
        };

        //calling these two functional interface implementations by using andThen
        multiply.andThen(division).accept(10, 5);
        nameAndActivities();
    }
}
