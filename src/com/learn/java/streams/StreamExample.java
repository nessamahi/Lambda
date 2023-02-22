package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {
        //student name as key and their activities as value

//        Map<String, List<String>> studentmap = StudentDatabase.getAllStudents().stream()
//                .filter((student) -> student.getGradeLevel() >= 3)
//                .collect((Collectors.toMap(Student::getName, Student::getActivities)));
        Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
        Predicate<Student> studentPredicate1 = (student -> student.getGpa() >= 3.9);

        Map<String, List<String>> studentmap = StudentDatabase.getAllStudents().stream()
                .peek(student -> {
                    System.out.println(student);
                })
                .filter(studentPredicate)
                .peek(student -> {
                    System.out.println("**************"+student);
                })
                .filter(studentPredicate1)
                .peek(student -> {
                    System.out.println("=============="+student);
                })
                .collect((Collectors.toMap(Student::getName, Student::getActivities)));

        System.out.println(studentmap);

//        List<String> name = Arrays.asList("adam", "dam", "dan");
//        System.out.println(name.parallelStream().distinct());

    }

}
