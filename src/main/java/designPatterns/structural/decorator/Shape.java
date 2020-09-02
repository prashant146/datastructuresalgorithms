package designPatterns.structural.decorator;


public interface Shape {
    void draw();
    void resize();
    String description();
    boolean isHide();
}
