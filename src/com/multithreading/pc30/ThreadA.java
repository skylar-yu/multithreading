package com.multithreading.pc30;

/**
 * Created by nanzhou on 2017/6/12.
 */
public class ThreadA extends Thread {

    private Object lock;

    public ThreadA(Object lock){

        super();
        this.lock = lock;
    }

    @Override
    public void run(){
        Service service = new Service();
        service.testMethod(lock);
    }
}
