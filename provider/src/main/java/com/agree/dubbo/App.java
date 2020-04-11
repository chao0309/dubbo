package com.agree.dubbo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Hello world!
 *
 */
public class App 
{
    private Lock lock = new ReentrantLock(false);
    private String str = "aaa";
    public  void get(){
        try {
            lock.lock();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
