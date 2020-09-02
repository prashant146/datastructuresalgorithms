package javamodules.lambdaexamples.jul2020.impl;

import javamodules.lambdaexamples.jul2020.FunctInterface1;
import javamodules.lambdaexamples.jul2020.FunctInterface3;
import javamodules.lambdaexamples.jul2020.FunctInterface4;
import javamodules.lambdaexamples.jul2020.Hello;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.BiFunction;

public class Solution {

    public static void main(String[] args) {

        String out = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'", Locale.US));
        System.out.println(out);

        Hello hello = ()-> "Good Morning";
        Hello hello1 = ()->{
          return "Good Morning again";
        };



        staticMethodReferenceExample();
        instanceMethodReferenceExample();
        example3();
        example2();
        example1();
        System.out.println(hello.greet());
        System.out.println(hello1.greet());
    }

    public static void staticMethodReferenceExample(){
        FunctInterface4 functInterface4 = Solution::example1;
        functInterface4.doSomething();
    }

    public static void instanceMethodReferenceExample(){
        Solution solution = new Solution();
        BiFunction<Integer,Integer,Integer > biFunction = solution::add;
        System.out.println(biFunction.apply(10, 15));
    }

    public int add(int a, int b){
        return a+b;
    }

    public static void example3(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");

        list.stream()
                .forEach((alphabet-> System.out.print(alphabet)));
        System.out.println();
        list.stream()
                .forEach(System.out::print);
        System.out.println();
    }

    public static void example1(){
        FunctInterface1 functInterface1 = score -> score*2;
        System.out.println(functInterface1.getScore(10));
    }

    public static void example2(){
        FunctInterface3 functInterface3 = (string1, string2) -> string1+string2;
        System.out.println(functInterface3.concat("Prashant ", "Chaudhary"));
    }
}
