package com.LearnJava.functionInterfaces;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String,Double>> studentFunction = (students -> {

        Map<String, Double> studentGrademap = new HashMap<>();

        students.forEach(student -> {
            if (PredicateStudentExample.p1.test(student)){//students grade lvl bigger than 3
                studentGrademap.put(student.getName(), student.getGpa());
            }

        });
        return studentGrademap;
    });

    public static void main(String[] args) {

        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

    }
}
