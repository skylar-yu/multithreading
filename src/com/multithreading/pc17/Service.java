package com.multithreading.pc17;

/**
 * Created by nanzhou on 2017/6/6.
 */
public class Service {


    public static void print(Object object){

        try {
            synchronized (object){
                while (true){

                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(1000);
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}