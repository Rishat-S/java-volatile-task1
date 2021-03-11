package ru.netology;

public class Box {
    private volatile boolean isOpen;

    public boolean isOpen() {
        return isOpen;
    }

    public synchronized void openBox() {
        if (isOpen) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isOpen = true;
        System.out.println(Thread.currentThread().getName() + " opened the box");
        notify();
    }

    public synchronized void closeBox() {
        if (!isOpen) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
                Thread.currentThread().interrupt();
                return;
            }
        }
        isOpen = false;
        System.out.println(Thread.currentThread().getName() + " closed the box");
        notify();
    }
}
