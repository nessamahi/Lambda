package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList(){
        return StudentDatabase.getAllStudents().stream()
                //getting Student as an input -> output is Student name
                .map(Student::getName) // output of this map method is Stream<String>, map is converting Student object into a Stream<String> object
                .map(String::toUpperCase) // this map is performing some operations, not converting the Stream<String>
                .collect(Collectors.toList()); //List<String>
    }

    public static Set<String> namesSet(){
        return StudentDatabase.getAllStudents().stream()
                //getting Student as an input -> output is Student name
                .map(Student::getName) // output of this map method is Stream<String>, map is converting Student object into a Stream<String> object
                .map(String::toUpperCase) // this map is performing some operations, not converting the Stream<String>
                .collect(Collectors.toSet());//Set<String>
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }

}
