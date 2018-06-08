package javamodules.concurrent.lock;

public class LockInternalImpl {

    private boolean isLocked;

    public void lock() throws InterruptedException {
        while (isLocked){
            wait();
        }
        isLocked=true;
    }

    public void unlock(){
        isLocked=false;
        notify();
    }

}
