package com.LearnJava.streams;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;

public class SteramMapReduceExample {

    private static int noOfNotebooks(){

       int noOfNotebooks = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks)//Stream<Integer>
                //.reduce(0,(a,b)-> a+b);
               .reduce(0,Integer::sum);
       return noOfNotebooks;
    }
    public static void main(String[] args) {
        System.out.println("noOfNotebooks : "+ noOfNotebooks());

    }
}
