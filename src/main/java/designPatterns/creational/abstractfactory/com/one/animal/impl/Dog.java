package designPatterns.creational.abstractfactory.com.one.animal.impl;


import designPatterns.creational.abstractfactory.com.one.animal.Animal;

public class Dog implements Animal {
    public Dog(){}
    @Override
    public String getAnimal() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Bark";
    }
}
