package javamodules.concurrent.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {

    Map<String, String> map = new HashMap<>();
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
    Lock readLock = readWriteLock.readLock();
    Lock writeLock = readWriteLock.writeLock();

    public void write(String key, String value){
        try{
            writeLock.lock();
            map.put(key, value);
        }finally {
            writeLock.unlock();
        }
    }
    public String read(String key){
        try{
            readLock.lock();
            return map.get(key);
        }finally {
            readLock.unlock();
        }
    }

}
