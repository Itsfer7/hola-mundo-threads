package main.java.org.example;

import java.util.Scanner;

public class GoodbyeWorldTask implements Runnable {

    private final int times;

    public GoodbyeWorldTask(int times) {
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            try {
                System.out.println("Goodbye world!");
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}