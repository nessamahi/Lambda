package com.learn.java.functionalInterfaces;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> {
        System.out.println(student);
    };
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());

    public static void printName() {
       List<Student> studentList = StudentDatabase.getAllStudents();
       studentList.forEach(c2);
       //without toString method this would have printed like this
       //com.learn.java.data.Student@682a0b20
       //com.learn.java.data.Student@3d075dc0
       //com.learn.java.data.Student@214c265e
       //com.learn.java.data.Student@448139f0
       //com.learn.java.data.Student@7cca494b
       //com.learn.java.data.Student@7ba4f24f
    }

    public static void printNameAndActivities(){
        List<Student> studentDatabaseList = StudentDatabase.getAllStudents();
        //first print c3 then c4
        System.out.println("PrintNameAndActivities");
        studentDatabaseList.forEach(c3.andThen(c4)); //consumer chaining, you can chain n number of consumer interfaces
    }

    public static void printNameAndActivitiesCondition() {
        List<Student> studentDatabaseList = StudentDatabase.getAllStudents();
        //first print c3 then c4
        System.out.println("PrintNameAndActivitiesCondition");
        studentDatabaseList.forEach((student) -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9) {
                //accept(student) is needed to pass the student for this method's condition to perform
                c3.andThen(c4).accept(student);
            }
        });
    }

    public static void main(String[] args) {
//        lambda expression
        Consumer<String> string = (s) -> {
            System.out.println(s.toUpperCase());
        };

//        string.accept("Java 8");
//        printName();
        printNameAndActivities();
        printNameAndActivitiesCondition();
    }
}
