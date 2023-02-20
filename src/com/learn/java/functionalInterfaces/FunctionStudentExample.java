package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentfunction = (studentList -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        studentList.forEach((student -> {
            if(PredicateAndConsumerExample.p2.test(student)){
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        }));
        return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(studentfunction.apply(StudentDatabase.getAllStudents()));
    }

}
