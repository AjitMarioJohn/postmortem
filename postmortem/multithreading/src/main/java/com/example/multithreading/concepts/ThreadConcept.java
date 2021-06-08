package com.example.multithreading.concepts;

public class ThreadConcept {
    public static void main(String[] args) {

//      starting one thread twice -> will throw IllegalThreadStateException while invoking second time, first invoke will work as it is
        /*try{
            Thread thread = new Thread(()->{
                System.out.println("Thread started");

                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Thread ended");
            }, "Thread1");
            thread.start();
            thread.start();
        }catch (Exception ex){
            ex.printStackTrace();
        }*/
    }
}
