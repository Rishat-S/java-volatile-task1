package ru.netology;

import java.util.concurrent.TimeUnit;

public class Gamer implements Runnable {
    public static final int ATTEMPTS = 6;
    public static final int TIMEOUT = 2;
    Box box;

    public Gamer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < ATTEMPTS; i++) {
            try {
                TimeUnit.SECONDS.sleep(TIMEOUT);
                System.out.println(Thread.currentThread().getName() + " open the box");
                box.openBox();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}