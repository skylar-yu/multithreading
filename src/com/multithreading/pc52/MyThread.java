package com.multithreading.pc52;

/**
 * Created by nanzhou on 2017/6/23.
 */
public class MyThread extends Thread {

    private MyService myService;

    public MyThread(MyService myService){

        super();
        this.myService= myService;
    }

    @Override
    public void run(){

        myService.testMethod();
    }

}
