package designPatterns.creational.abstractfactory.com.two.impl;


import designPatterns.creational.abstractfactory.com.one.animal.Animal;
import designPatterns.creational.abstractfactory.com.one.animal.impl.Cat;
import designPatterns.creational.abstractfactory.com.one.animal.impl.Dog;
import designPatterns.creational.abstractfactory.com.one.animal.impl.Duck;
import designPatterns.creational.abstractfactory.com.two.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {
    @Override
    public Animal create(String type) {
        if("Dog".equalsIgnoreCase(type)){
            return new Dog();
        }else if("Cat".equalsIgnoreCase(type)){
            return new Cat();
        }else if("Duck".equalsIgnoreCase(type)){
            return new Duck();
        }

        return null;
    }
}
