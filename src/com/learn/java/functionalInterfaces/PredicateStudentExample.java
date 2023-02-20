package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel(){
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student -> {
            if(p1.test(student)){
                System.out.println(student);
            }
        }));
    }

    public static void filterStudentByGpa(){
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student -> {
            if(p2.test(student)){
                System.out.println("By GPA : "+student);
            }
        }));
    }

    public static void students(){
        List<Student> studentList = StudentDatabase.getAllStudents();
        studentList.forEach((student -> {
            if(p1.or(p2).negate().test(student)){
                System.out.println("Common filter OR : "+student);
            }
        }));
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGpa();
        students();
    }
}
