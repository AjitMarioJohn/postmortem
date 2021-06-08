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

//        find state of the thread -> return the state of thread whether NEW, RUNNABLE, WAIINT
        /*Runnable runnable = ()->{
            System.out.println(String.format("thread  :: %s %s", Thread.currentThread().getName(), Thread.currentThread().getState()));
        };
        Thread thread1 =  new Thread(runnable, "Thread 1");
        Thread thread2 =  new Thread(runnable, "Thread 2");
        System.out.println(String.format("thread  ::  %s %s", thread1.getName(), thread1.getState()));
        thread1.start();
        System.out.println(String.format("thread  ::  %s %s", thread1.getName(), thread1.getState()));
        thread2.start();
        System.out.println(String.format("thread  ::  %s %s", thread2.getName(), thread2.getState()));*/

//        Daemon Thread -> service provider thread that provides services to the user thread. Its life depend on the mercy of user threads
//        i.e. when all the user threads dies, JVM terminates this thread automatically.
//        Note -> if user thread is started then it cannot be converted to daemon. On attempting it will throw IllegalThreadStateException exception
        /*Runnable runnable = ()->{
            if(Thread.currentThread().isDaemon()){
                System.out.println(String.format("daemon thread  :: %s %s", Thread.currentThread().getName(), Thread.currentThread().getState()));
                return;
            }

            System.out.println(String.format("user thread  :: %s %s", Thread.currentThread().getName(), Thread.currentThread().getState()));
        };
        Thread thread1 =  new Thread(runnable, "Thread 1");
        Thread thread2 =  new Thread(runnable, "Thread 2");

        *//*thread1.setDaemon(true);
        thread1.start();
        thread2.start();*//*

//        Note -> if user thread is started then it cannot be converted to daemon. On attempting it will throw IllegalThreadStateException exception
        thread1.start();
        thread1.setDaemon(true);
        thread2.start();*/


    }

}
