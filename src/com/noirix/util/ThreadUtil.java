package com.noirix.util;

public class ThreadUtil {
    /*Class<ThreadUtil> has been locked by Thread-1*/
    public static synchronized void threadStats(Thread thread) {
        System.out.println("\n");
        System.out.println("Thread Stats: \n");
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println(thread.getState());
        System.out.println(thread.getPriority());
        System.out.println("\n");
    }
}
