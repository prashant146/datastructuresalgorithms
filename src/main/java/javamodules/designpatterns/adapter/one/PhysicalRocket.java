package javamodules.designpatterns.adapter.one;

public class PhysicalRocket {

    double thrust;
    double totalMass;

    public PhysicalRocket(
            double thrust,
            double totalMass){

        this.thrust=thrust;
        this.totalMass=totalMass;
    }

    public double getThrust(){
                return thrust*3.14;
    }

    public double getTotalMass(){
        return totalMass*3.14;
    }

}
