package javamodules.designpatterns.adapter.one;

public class MyAdapterClass extends PhysicalRocket implements  RocketSimulation {
    public MyAdapterClass(double thrust, double totalMass) {
        super(thrust, totalMass);
    }


}
