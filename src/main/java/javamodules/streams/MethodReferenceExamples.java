package javamodules.streams;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExamples {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 1, 6, 11, 34, 0, 15);
        list.stream()
                .forEach(MethodReferenceExamples::print);

        MethodReferenceExamples obj = new MethodReferenceExamples();
        list.stream().sorted(obj::compare)
        .forEach(MethodReferenceExamples::print);

    }

    public static void print(int number){
        System.out.println("Printing number: "+number);
    }

    public int compare(Integer a, Integer b){
        return a.compareTo(b);
    }
}
