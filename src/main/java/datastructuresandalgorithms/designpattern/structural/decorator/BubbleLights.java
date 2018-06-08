package datastructuresandalgorithms.designpattern.structural.decorator;

public class BubbleLights extends TreeDecorator {

    public BubbleLights(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate()+"---"+decorateBubbleLights();
    }

    public String decorateBubbleLights(){
        return "Bubble Lights added";
    }
}
