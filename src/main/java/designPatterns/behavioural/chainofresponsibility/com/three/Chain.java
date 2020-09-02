package designPatterns.behavioural.chainofresponsibility.com.three;

public interface Chain {

    void setNextChain(Chain chain);
    void calculate(Numbers request);
}
