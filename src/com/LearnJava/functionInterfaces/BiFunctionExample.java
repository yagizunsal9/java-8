package com.LearnJava.functionInterfaces;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String,Double>> biFunction = ((students,studentsPredicate) -> {

        Map<String,Double> studentGradeMap = new HashMap<>();
        students.forEach(student -> {{
        if (studentsPredicate.test(student)){
            studentGradeMap.put(student.getName(), student.getGpa());
        }
        }
        });
        return studentGradeMap;
    });

    public static void main(String[] args) {

        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.p1));//get all students which grade is bigger than 3(p1 in predicate class)
    }
}
