package designPatterns.creational.abstractfactory.com.two.impl;

import designPatterns.creational.abstractfactory.com.one.color.Color;
import designPatterns.creational.abstractfactory.com.one.color.impl.Orange;
import designPatterns.creational.abstractfactory.com.one.color.impl.Red;
import designPatterns.creational.abstractfactory.com.one.color.impl.White;
import designPatterns.creational.abstractfactory.com.two.AbstractFactory;

public class ColorFactory implements AbstractFactory<Color> {

    @Override
    public Color create(String type) {
        if("Red".equalsIgnoreCase(type)){
            return new Red();
        }else if("White".equalsIgnoreCase(type)){
            return new White();
        }else if("Orange".equalsIgnoreCase(type)){
            return new Orange();
        }
        return null;
    }
}
