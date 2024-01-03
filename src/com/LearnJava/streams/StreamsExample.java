package com.LearnJava.streams;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;
import com.LearnJava.functionInterfaces.PredicateStudentExample;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    static Predicate<Student> studentPredicate = (student -> student.getGradeLevel()>=3);
    static Predicate<Student> studentgpaPredicate = (student -> student.getGpa()>=3.9);

    public static void main(String[] args) {
        //student name and their activities in the map



        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents().stream()//.parallelStream() yaparsak aynısı olur ama program arkada paralel çalışır
                .peek((student -> {
                    System.out.println(student);
                }))
                .filter(studentPredicate)//Stream<Students>
                .peek((student -> {//use peek for debugging
                    System.out.println("After 1st filter -" +student);
                }))
                .filter(studentgpaPredicate)//Stream<Students>
                .peek((student -> { //use peek for debugging
                    System.out.println("After 2nd filter -" +student);
                }))
                .collect(Collectors.toMap(Student::getName,Student::getActivities));//Prints student that grade level >=3 and gpa >=3.9 //Map

        System.out.println(studentMap);

    }
}
