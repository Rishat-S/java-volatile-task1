package ru.netology;

import java.util.concurrent.TimeUnit;

public class Gamer implements Runnable {
    Box box;

    public Gamer(Box box) {
        this.box = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.println(Thread.currentThread().getName() + " open the box");
                box.openBox();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
