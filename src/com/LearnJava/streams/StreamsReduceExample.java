package com.LearnJava.streams;

import com.LearnJava.data.Student;
import com.LearnJava.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultification(List<Integer> integerList){
       return  integerList.stream()
               //1
               //3
               //5
               //7
               // a=1, b=1 (from stream) -> result 1 is returned
               // a=1, b=3 (from stream) -> result 3 is returned
               //a=3, b=5 (from stream) -> result 15 is returned
               //a=15, b=17 (from stream) -> result 105 is returned
               //background operations
                .reduce(1,(a,b) -> a*b);
    }

    public static Optional<Integer> performMultificationWithoutIdentity(List<Integer> integerList){
        return  integerList.stream()
                //1
                //3
                //5
                //7
                .reduce((a,b) -> a*b);
    }

    public static Optional<Student> getHighestGPAStudent(){
    //Students by one by
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) -> {   // .reduce((s1,s2) -> (s1.getGpa()>s2.getGpa()) ? s1 : s2);  //Optional code with same output
                        if (s1.getGpa()>s2.getGpa()){
                            return s1;
                        }else {
                            return s2;
                        }
                });
    }
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,3,5,7);

        System.out.println(performMultification(integers));

        Optional<Integer> result = performMultificationWithoutIdentity(integers);

        System.out.println(result.isPresent());//IF LIST IS EMPTY RETURN FALSE
        System.out.println(result.get());

        Optional<Student> studentOptional = getHighestGPAStudent();
        if (getHighestGPAStudent().isPresent()){
            System.out.println(studentOptional.get());
        }
    }
}
