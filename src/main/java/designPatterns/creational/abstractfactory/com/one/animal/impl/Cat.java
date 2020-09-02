package designPatterns.creational.abstractfactory.com.one.animal.impl;


import designPatterns.creational.abstractfactory.com.one.animal.Animal;

public class Cat implements Animal {
    @Override
    public String getAnimal() {
        return "Cat";
    }

    @Override
    public String makeSound() {
        return "Meow";
    }
}
