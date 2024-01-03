package com.LearnJava.streams;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindExample {

    public static Optional<Student> findAnyStudent(){
       return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();

    }

    public static Optional<Student> findFirstStudent(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();

    }
    public static void main(String[] args) {

        Optional<Student> studentOptionalFindAny = findAnyStudent();
        if (studentOptionalFindAny.isPresent()){
            System.out.println("Found The student Any : "+ studentOptionalFindAny.get());
        }else{
            System.out.println("Student Not Found");
        }
        Optional<Student> studentOptionalFindFirst = findFirstStudent();
        if (studentOptionalFindFirst.isPresent()){
            System.out.println("Found The student First : "+ studentOptionalFindFirst.get());
        }else{
            System.out.println("Student Not Found");
        }


    }
}
