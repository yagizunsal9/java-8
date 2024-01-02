package com.LearnJava.functionInterfaces;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<Student> studentSupplier = () -> {
        return new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));
    };
    static Supplier<List<Student>> listSupplier = ()-> StudentDataBase.getAllStudents();

    public static void main(String[] args) {
        //prints the given student
        System.out.println("Student is : " + studentSupplier.get());
        // prints all the students from given list
        System.out.println("Student is : " + listSupplier.get());
    }
}
