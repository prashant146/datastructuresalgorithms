package datastructuresandalgorithms.designpattern.structural.decorator;

public class GarlandLight extends TreeDecorator {

    public GarlandLight(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + " I'm in GarlandLight";
    }
}
