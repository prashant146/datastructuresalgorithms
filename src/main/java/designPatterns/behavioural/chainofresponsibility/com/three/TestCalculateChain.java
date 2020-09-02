package designPatterns.behavioural.chainofresponsibility.com.three;

public class TestCalculateChain {

    public static void main(String[] args) {
        Chain chain1 = new AddNumbers();
        Chain chain2 = new SubNumbers();
        Chain chain3 = new MultNumbers();
        Chain chain4 = new DivNumbers();

        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);

        Numbers numbers = new Numbers(3, 4, "add");
        chain1.calculate(numbers);

        numbers = new Numbers(3, 4, "sub");
        chain1.calculate(numbers);

        numbers = new Numbers(3, 4, "mult");
        chain1.calculate(numbers);

        numbers = new Numbers(3, 4, "div");
        chain1.calculate(numbers);

    }
}
