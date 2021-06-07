package com.example.multithreading.classMethods;

import java.util.concurrent.TimeUnit;

public class ThreadUtilityMethods {

    public static void main(String[] args) {

//        It's the job of start method to create thread and assign stack. Calling run instead of start we just work as normal method
        /*Runnable runnable = () -> System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(runnable);
        thread.start();
        System.out.println("main method thread :: "+ Thread.currentThread().getName());
        thread.run();*/

//         sleeping thread -> cease current thread for specified time. It throws Interrupted Exception so need to use try catch
        /*Thread thread = new Thread(()->{
            System.out.println("Begin thread :: "+ Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("end of thread :: "+ Thread.currentThread().getName());
        }, "Sleep Thread");
        thread.start();*/

//        join -> wait for the thread to die. If time is mentioned then wait for the specified time and check whether thread is died or not
        /*Thread thread1 = new Thread(()->{
                System.out.println("Begin thread :: "+ Thread.currentThread().getName());
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end of thread :: "+ Thread.currentThread().getName());
        }, "Thread1");

        Thread thread2 =  new Thread(()->{
            System.out.println("Begin thread :: "+ Thread.currentThread().getName());
        }, "Thread 2");*/

        /*try {
            thread1.start();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();*/

        /*try {
            thread1.start();
            TimeUnit.SECONDS.timedJoin(thread1, 1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();*/

//        find state of the thread
        Thread thread1 =  new Thread(()->{
            System.out.println("thread 1 state :: "+ Thread.currentThread().getState());
        }, "Thread 1");

        System.out.println("Main thread state "+ Thread.currentThread().getState());
        thread1.start();
        System.out.println("Main thread state "+ Thread.currentThread().getState());

    }

}
