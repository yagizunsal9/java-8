package com.LearnJava.streams;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class StreamsFilterExample {

    static Predicate<Student> p1 = student -> student.getGpa()>=3.9;
    static Predicate<Student> p2 = student -> student.getGender().equals("female");

    public static List<Student> filterStudents(){

       return StudentDataBase.getAllStudents().stream()//-> Stream<Student>
                .filter(p2)//-> Stream<Student>
                //filter and sends students only female gender
               .filter(p1)
                .collect(toList());
    }
    public static void main(String[] args) {

        //System.out.println("filter students : " + filterStudents());
        filterStudents().forEach(System.out::println);
            
        }

    }

