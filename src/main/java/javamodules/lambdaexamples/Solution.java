package javamodules.lambdaexamples;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Solution {

    public static void main(String[] args) {
        FunctionalInterface1 usage = ()-> System.out.println("Inside display method of FunctionalInterface1");
        usage.display();

        String sample = "sample";
        FunctionalInterface2 usage2 = System.out::println;
        usage2.displayWithParam("I AM A CODER");

        BiFunction<Integer, Integer, Integer> biFunction = Solution::multiply;
        System.out.println(biFunction.apply(10, 5));

        BiFunction<Integer, Integer, Integer> bf = (a, b)->{
            return a*b;
        };
        Consumer<String> consumer = System.out::println;
        consumer.accept("Consumer example");
    }

    public static Integer multiply(int a, int b){
        return a*b;
    }

}
