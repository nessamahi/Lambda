package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {

    public static List<Student> sortedStudents(){
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortedStudentsGpa(){
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static List<Student> sortedStudentsGpaDesc(){
        return StudentDatabase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(sortedStudents());
        System.out.println("===========================");
        sortedStudents().forEach(System.out::println);
        System.out.println("******************************");
        sortedStudentsGpa().forEach(System.out::println);
        System.out.println("===========================");
        sortedStudentsGpaDesc().forEach(System.out::println);
    }

}
