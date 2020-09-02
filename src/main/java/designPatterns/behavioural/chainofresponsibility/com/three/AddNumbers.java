package designPatterns.behavioural.chainofresponsibility.com.three;

public class AddNumbers implements Chain {

    private Chain nextChain;

    @Override
    public void setNextChain(Chain chain) {
        this.nextChain=chain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted().equalsIgnoreCase("add")){
            System.out.println(request.getNumber1()+"+"+request.getNumber2()+"="+(request.getNumber1()+request.getNumber2()));
        }else{
            nextChain.calculate(request);
        }
    }
}
