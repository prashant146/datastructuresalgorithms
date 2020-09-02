package designPatterns.creational.abstractfactory.com.two;


import designPatterns.creational.abstractfactory.com.one.animal.Animal;
import designPatterns.creational.abstractfactory.com.one.color.Color;
import designPatterns.creational.abstractfactory.com.two.impl.AnimalFactory;
import designPatterns.creational.abstractfactory.com.two.impl.ColorFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice){
        if("Animal".equalsIgnoreCase(choice)){
            return new AnimalFactory();
        }else if("Color".equalsIgnoreCase(choice)){
            return new ColorFactory();
        }
        return null;
    }

    public static void main(String[] args) {
        AbstractFactory<Animal> animalAbstractFactory = FactoryProvider.getFactory("Animal");
        Animal dog = animalAbstractFactory.create("Dog");
        System.out.println(dog.getAnimal());
        System.out.println(dog.makeSound()+"\n");

        Animal cat = animalAbstractFactory.create("Cat");
        System.out.println(cat.getAnimal());
        System.out.println(cat.makeSound()+"\n");


        Animal duck = animalAbstractFactory.create("Duck");
        System.out.println(duck.getAnimal());
        System.out.println(duck.makeSound()+"\n");

        AbstractFactory<Color> colorAbstractFactory = FactoryProvider.getFactory("Color");
        Color red = colorAbstractFactory.create("Red");
        System.out.println(red.getColor());

        Color white = colorAbstractFactory.create("White");
        System.out.println(white.getColor());

        Color orange = colorAbstractFactory.create("Orange");
        System.out.println(orange.getColor());
    }
}
