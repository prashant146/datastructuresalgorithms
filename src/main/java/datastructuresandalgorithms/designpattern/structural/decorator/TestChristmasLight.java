package datastructuresandalgorithms.designpattern.structural.decorator;

public class TestChristmasLight {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new GarlandLight(new ChristmasTreeImpl());
        System.out.println(christmasTree.decorate());

    }


}
