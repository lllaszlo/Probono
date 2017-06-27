package com.apertus.helper;


public abstract class ThreadSleepSupport {
    //SLEEP
    public static void sleep(int x) {
        try {
            Thread.sleep(x);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
