package com.LearnJava.streams;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class StreamsMapExample {

    //METHODS START
    public static List<String> namesList(){
       List<String> studentList =  StudentDataBase.getAllStudents().stream()//-> Stream<Students>
                //student as an input -> Student name output
                .map(Student::getName)//Stream<String>
               .map(String::toUpperCase)//Stream<String> ->It performs uppercase operations on names
                .collect(toList());

       return studentList;
    }

    public static Set<String> namesSet(){
        Set<String> studentSet =  StudentDataBase.getAllStudents().stream()//-> Stream<Students>
                //student as an input -> Student name output
                .map(Student::getName)//Stream<String>
                .map(String::toUpperCase)//Stream<String> ->It performs uppercase operations on names
                .collect(toSet());

        return studentSet;
    }
    //METHODS END
    public static void main(String[] args) {

        System.out.println(namesList());

        System.out.println(namesSet());

    }
}
