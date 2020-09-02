package designPatterns.creational.abstractfactory.com.two;

public interface AbstractFactory<T> {
    T create (String type);
}
