package designPatterns.creational.abstractfactory.com.one.animal.impl;


import designPatterns.creational.abstractfactory.com.one.animal.Animal;

public class Duck implements Animal {

    @Override
    public String getAnimal() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeak";
    }
}
