package javamodules.designpatterns.structural.proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

    @Override
    public void process() {

        System.out.println("Processing Complete in implementation");

    }

    public void heavyInitialConfiguration(){
        System.out.println("Loaded initial configuration");
    }
}
