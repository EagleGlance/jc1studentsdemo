package com.noirix.concurrency;

import com.noirix.util.ThreadUtil;

public class ThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println("Runnable");
                ThreadUtil.threadStats(Thread.currentThread());
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
