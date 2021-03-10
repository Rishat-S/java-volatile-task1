package ru.netology;

public class Box {
    private boolean isOpen;

    public synchronized void openBox() {
        while (isOpen) {
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
        while (!isOpen) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Toy interrupted");
            }
        }
        isOpen = false;
        System.out.println(Thread.currentThread().getName() + " closed the box");
        notify();
    }
}
