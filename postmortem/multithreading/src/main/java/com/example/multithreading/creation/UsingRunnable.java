package com.example.multithreading.creation;

public class UsingRunnable{

    public static void main(String[] args) {
        Runnable runnable = ()->{
            System.out.println("User Thread using Runnable :: "+Thread.currentThread().getName());
        };

        // Creating thread without name
        Thread unnamedThread = new Thread(runnable);
        unnamedThread.start();

        //creating thread with name
        Thread namedThread = new Thread(runnable, "Named thread");
        namedThread.start();
        System.out.println("Main Thread :: "+Thread.currentThread().getName());
    }
}
