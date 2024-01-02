package com.LearnJava.functionInterfaces;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;
import java.util.List;
import java.util.function.Consumer;




public class ConsumerExample {
    static Consumer<Student> c2 = (student) -> System.out.println(student);
    static Consumer<Student> c3 = (student) -> System.out.print(student.getName());
    static Consumer<Student> c4 = (student) -> System.out.println(student.getActivities());
    static List<Student> studentList = StudentDataBase.getAllStudents();
    public static void printName() {
        System.out.println("printName :");

        studentList.forEach(c3);
    }

    public static void printNameAndActivities(){
        System.out.println("printNameAndActivities :");
        studentList.forEach(c3.andThen(c4));
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("printNameAndActivitiesUsingCondition :");
        studentList.forEach((student -> {
            if(student.getGradeLevel()>3){
                c3.andThen(c4).andThen(c2).accept(student);
            }
        }));
    }

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8");
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
