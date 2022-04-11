package com.noirix.concurrency;

import com.noirix.util.ThreadUtil;

public class ThreadExtends extends Thread {

    private Object lock = new Object();

    public synchronized void someLogic() {
        System.out.println("blskfjlasfjlak");
        /*lock object has been locked by thread*/
        synchronized (lock) {

            System.out.println("Critical section synchronization");
            System.out.println("Critical section synchronization 1");
            System.out.println("Critical section synchronization 2");
        }
        System.out.println("blskfjlasfjlak");
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {

            try {
                System.out.println("Thread");
                ThreadUtil.threadStats(Thread.currentThread());
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
