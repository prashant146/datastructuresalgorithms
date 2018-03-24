package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sol{

    int a = 10;
    private int c = 15;
    private int d;
    static int b = 20;

    static class InnerStaticClass{

        public void method(){
            System.out.println("inside static class method");
        }
    }

    class InnerClass{

        int var = 10;
        public void method(){
            System.out.println("inside inner class"+a);
        }
    }

    public static void main(String[] args){

        Sol sol = new Sol();
        System.out.println(sol.d);
        TreeMap<String, Integer> hm = new TreeMap<>();
        hm.put("Hello", 1);
        hm.put("world", 2);
        hm.put("A", 3);
        hm.put("B", 4);

        for(Map.Entry<String, Integer> h : hm.entrySet()){
            System.out.println(h.getKey()+"------"+h.getValue());
        }
    }
}
