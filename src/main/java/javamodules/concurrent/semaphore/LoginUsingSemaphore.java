package javamodules.concurrent.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.stream.IntStream;

public class LoginUsingSemaphore {

    private Semaphore semaphore;

    public LoginUsingSemaphore(int slotLimits){
        this.semaphore=new Semaphore(slotLimits);
    }

    public boolean login(){
        return this.semaphore.tryAcquire();
    }

    public void logout(){
        this.semaphore.release();
    }

    public int availablePermits(){
        return this.semaphore.availablePermits();
    }

    public static void main(String[] args) {
        int slots = 10;
        LoginUsingSemaphore loginUsingSemaphore = new LoginUsingSemaphore(slots);
        ExecutorService executorService = Executors.newFixedThreadPool(slots);
        IntStream.range(0, slots)
                .forEach((t)->executorService.execute(loginUsingSemaphore::login));

        System.out.println(loginUsingSemaphore.semaphore.availablePermits());
        loginUsingSemaphore.logout();
        System.out.println(loginUsingSemaphore.semaphore.availablePermits());
        executorService.shutdown();
    }
}
