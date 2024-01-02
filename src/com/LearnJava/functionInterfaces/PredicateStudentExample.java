package com.LearnJava.functionInterfaces;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> p1 = (s) -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = (s) -> s.getGpa()>=3.9;
    static List<Student> studentList = StudentDataBase.getAllStudents();
    public static void filterStudentByGradeLevel(){
        System.out.println("Filter Student by Grade Level :");
        studentList.forEach((student -> {

        if (p1.test(student)) {//s.getGradeLevel()>=3;
            System.out.println(student);
        }
    }));
    }//end of filterStudentByGradeLevel method

    public static void filteredStudentByGpa(){
        System.out.println("Filter Student by Gpa :");
        studentList.forEach((student -> {
            if (p2.test(student)){//s.getGpa()>=3.9;
                System.out.println(student);
            }
        }));
    }//end of filteredStudentByGpa method

    public static void filteredStudent(){
        System.out.println("Filter Student by Gpa and Grade Level:");
        studentList.forEach((student -> {
            if (p1.and(p2).test(student)){//s.getGradeLevel()>=3;s.getGpa()>=3.9;
                System.out.println(student);
            }
        }));
    }//end of filteredStudent method




    public static void main(String[] args) {

        filterStudentByGradeLevel();

        filteredStudentByGpa();

        filteredStudent();

    }

}
