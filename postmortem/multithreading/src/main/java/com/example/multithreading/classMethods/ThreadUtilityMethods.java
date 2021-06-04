package com.example.multithreading.classMethods;

import java.util.concurrent.TimeUnit;

public class ThreadUtilityMethods {

    public static void main(String[] args) {

//        Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
//        Thread thread = new Thread(runnable);
//        It's the job of start method to create thread and assign stack. Calling run instead of start we just work as normal method
//        thread.start();
//        System.out.println("main method thread :: "+ Thread.currentThread().getName());
//        thread.run();

        // sleeping thread -> cease current thread for specified time. It throws Interrupted Exception so need to use try catch
        Thread thread = new Thread(()->{
            System.out.println("Begin thread :: "+ Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end of thread :: "+ Thread.currentThread().getName());
        }, "Sleep Thread");
        thread.start();

    }

}
