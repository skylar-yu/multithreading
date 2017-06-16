package com.multithreading.pc37;

/**
 * Created by nanzhou on 2017/6/16.
 */
public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p){

        super();
        this.p = p;
    }

    @Override
    public void run(){

        while(true){
            p.setValue();
        }
    }
}
