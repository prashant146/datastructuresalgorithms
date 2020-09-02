package designPatterns.creational.abstractfactory.com.one.color.impl;


import designPatterns.creational.abstractfactory.com.one.color.Color;

public class Red implements Color {
    @Override
    public String getColor() {
        return "Red";
    }
}
