package com.learn.java.constructorReference;

import com.learn.java.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExample {

    static Supplier<Student> studentSupplier = Student::new; //creates a student object
    static Function<String, Student> stringStudentFunction = Student::new; //creates a student object

    public static void main(String[] args) {
        System.out.println(studentSupplier.get());
        System.out.println(stringStudentFunction.apply("ABC"));
    }


}
