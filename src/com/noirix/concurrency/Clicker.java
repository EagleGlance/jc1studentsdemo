package com.noirix.concurrency;

public class Clicker extends Thread {
    private int click = 0;
    private boolean isRunning = true;

    @Override
    public void run() {
        while(isRunning) {
            click++;
            System.out.println(click);
        }
    }

    public int getClick() {
        return click;
    }

    public void stopClicking() {
        isRunning = false;
    }
}
