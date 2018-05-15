package javamodules.designpatterns.structural.proxy;

public class ExpensiveObjectProxy implements ExpensiveObject {

    ExpensiveObject expensiveObject = null;

    @Override
    public void process() {

        if(expensiveObject==null){
            System.out.println("created object");
            expensiveObject = new ExpensiveObjectImpl();
        }
        expensiveObject.process();
    }
}
