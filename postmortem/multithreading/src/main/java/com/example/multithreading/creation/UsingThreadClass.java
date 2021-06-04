package com.example.multithreading.creation;

public class UsingThreadClass extends Thread{

    public UsingThreadClass() {
    }

    public UsingThreadClass(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("User Thread :: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        // without any name
        Thread unnamedThread = new UsingThreadClass();
        unnamedThread.start();

        //provide name to thread
        Thread namedThread = new UsingThreadClass("Named Thread");
        namedThread.start();

        System.out.println("main thread :: "+Thread.currentThread().getName());
    }
}
