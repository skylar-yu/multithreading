package com.multithreading.pc21;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class ThreadB extends  Thread{

    private MyService myService;

    public ThreadB(MyService myService){

        super();
        this.myService = myService;
    }

    @Override
    public void run(){

        super.run();
        myService.testMethod();
    }
}
