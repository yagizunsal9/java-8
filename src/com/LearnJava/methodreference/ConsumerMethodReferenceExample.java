package com.LearnJava.methodreference;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    /**
     * Classname::methodName
     * */
    static Consumer<Student> c2 = System.out::println;

    /**
     * Classname::instanceMethodName
     * */
    static Consumer<Student>  c3 = Student::printListOfActivities;
    public static void main(String[] args) {

        StudentDataBase.getAllStudents().forEach(c2);
        StudentDataBase.getAllStudents().forEach(c3);
    }
}
