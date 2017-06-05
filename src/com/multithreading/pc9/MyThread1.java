package com.multithreading.pc9;

/**
 * Created by nanzhou on 2017/6/1.
 */
public class MyThread1 extends Thread{

    private Task task;

    public MyThread1(Task task){

        super();
        this.task = task;
    }

    @Override
    public void run(){

        super.run();
        CommonUtils.beginTime1 = System.currentTimeMillis();
        task.doLongTimeTask();
        CommonUtils.endTime1 = System.currentTimeMillis();

    }
}
