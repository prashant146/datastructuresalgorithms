package javamodules.designpatterns.structural.proxy;

public class Solution {

    public static void main(String[] args) {

        ExpensiveObject expensiveObject = new ExpensiveObjectProxy();
        expensiveObject.process();
        expensiveObject.process();

    }
}
