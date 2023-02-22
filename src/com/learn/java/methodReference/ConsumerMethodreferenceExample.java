package com.learn.java.methodReference;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.function.Consumer;

public class ConsumerMethodreferenceExample {

    static Consumer<Student> c1 = System.out::println;
    static Consumer<Student> c2 = Student::printActivities;

    public static void main(String[] args) {
        StudentDatabase.getAllStudents().forEach(c1);
        StudentDatabase.getAllStudents().forEach(c2);
    }
}
