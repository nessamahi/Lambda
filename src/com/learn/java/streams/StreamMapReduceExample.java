package com.learn.java.streams;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamMapReduceExample {

    private static int noOfNoteBooks(){
        int numberOfNotebooks = StudentDatabase.getAllStudents().stream() //Stream<Student>
                .filter(student -> student.getGradeLevel() >= 3)
                .map(Student::getNoteBook) //Stream<Integer>
//                .reduce(0, (a,b) -> a+b);
                .reduce(0, Integer::sum);

        return numberOfNotebooks;
    }

    public static void main(String[] args) {
        System.out.println("Number of notebooks : " +noOfNoteBooks());
    }

}
