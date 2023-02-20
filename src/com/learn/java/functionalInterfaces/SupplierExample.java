package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () -> {
            return  new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming","basketball", "volleyball"));
        };

        System.out.println(studentSupplier.get());

        Supplier<List<Student>> listSupplier = () -> StudentDatabase.getAllStudents();

        System.out.println(listSupplier.get());
    }

}
