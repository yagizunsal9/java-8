package com.LearnJava.streams;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities(){

        List<String>  studentActivities = StudentDataBase.getAllStudents().stream()//-> Stream<Student>
                .map(Student::getActivities)//-> Stream<List<String>>
                .flatMap(List::stream)// -> Stream<String>
                .distinct()// There is no more repeatable elements i List all of them are unique
                .sorted()
                .collect(toList());

       return studentActivities;
    }

    public static long getStudetActivitiesCount(){

        long numberOfActivities = StudentDataBase.getAllStudents().stream()//-> Stream<Student>
                .map(Student::getActivities)//-> Stream<List<String>>
                .flatMap(List::stream)// -> Stream<String>
                .distinct()//-> Stream<String> There is no more repeatable elements i List all of them are unique
                .count();

        return numberOfActivities;
    }

    public static void main(String[] args) {

        System.out.println(printStudentActivities());
        System.out.println(getStudetActivitiesCount());
    }
}
