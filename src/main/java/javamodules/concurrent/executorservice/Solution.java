package javamodules.concurrent.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Solution {

    public static void main(String[] args) throws  Exception {

        m1();

    }

    public static void m1() throws Exception{

        List<Callable<String>> callables = new ArrayList<>();

        Callable<String> callable1 = () -> {
            return "Inside callable 1";
        };
        callables.add(callable1);

        Callable<String> callable2 = () -> {
            return "Inside callable 2";
        };
        callables.add(callable2);

        Callable<String> callable3 = () -> {
            return "Inside callable 3";
        };
        callables.add(callable3);

        Callable<String> callable4 = () -> {
            return "Inside callable 4";
        };
        callables.add(callable4);

        Callable<String> callable5 = () -> {
            return "Inside callable 5";
        };
        callables.add(callable5);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        try {
            List<Future<String>> list = executorService.invokeAll(callables);
            list.stream().forEach(stringFuture -> {

                try{
                    System.out.println(stringFuture.get());
                }catch (Exception e){

                }
            });


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Invoke any: "+executorService.invokeAny(callables));

        executorService.shutdown();


    }

}
