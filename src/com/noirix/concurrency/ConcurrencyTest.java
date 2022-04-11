package com.noirix.concurrency;

public class ConcurrencyTest {
    public static void main(String[] args) {
        ThreadRunnable threadRunnable = new ThreadRunnable();
        ThreadExtends threadExtends = new ThreadExtends();
        ThreadExtends threadExtends1 = new ThreadExtends();

        Thread thread = new Thread(threadRunnable);

        thread.setPriority(Thread.MAX_PRIORITY);
        threadExtends.setPriority(Thread.MIN_PRIORITY);
        thread.setName("RunnableThread");
        threadExtends.setName("ThreadThread");

        System.out.println("Start of runnable method run implementation!");
        thread.start(); //Runnable
        System.out.println("Start of thread method run implementation!");
        threadExtends.start(); //Thread
        threadExtends1.start(); //Thread

        threadExtends.someLogic();
        try {
            threadExtends.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadExtends1.someLogic();
        System.out.println("Some Info in main thread");
    }
}
