package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {
    //lambda behaves the same for instance method and static method

    Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
    Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;
    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;

    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> {
        System.out.println(name+ " : " +activities);
    };
//    Consumer<Student> studentConsumer = (student -> {
//        if(p1.and(p2).test(student)){
//            studentBiConsumer.accept(student.getName(), student.getActivities());
//        }
//    });

    Consumer<Student> studentConsumer1 = (student -> {
        if(biPredicate.test(student.getGradeLevel(), student.getGpa())){
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    //functional interface implementation is ready above

    public void printNameAndActivities(List<Student> studentList){
        studentList.forEach(studentConsumer1);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDatabase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }

}
