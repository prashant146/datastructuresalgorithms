package javamodules.designpatterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton threadSafeSingleton;

    public static ThreadSafeSingleton getThreadSafeSingleton(){

        if(threadSafeSingleton ==null){
            synchronized (threadSafeSingleton){
                if(threadSafeSingleton !=null){
                    return new ThreadSafeSingleton();
                }else
                    return threadSafeSingleton;
            }

        }else
            return threadSafeSingleton;

    }

}
