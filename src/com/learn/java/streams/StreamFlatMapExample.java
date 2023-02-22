package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static List<String> printActivities(){
       return StudentDatabase.getAllStudents().stream()
                .map(Student::getActivities) //Stream<List<String>>
               .flatMap(List::stream)//Stream<String>
               .distinct()
               .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(printActivities());
    }

}
