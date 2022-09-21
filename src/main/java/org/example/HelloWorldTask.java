package main.java.org.example;

public class HelloWorldTask implements Runnable {

    private final int times;

    public HelloWorldTask(int times) {
        this.times = times;
    }

    @Override
        public void run() {
        for (int i = 0; i < times; i++) {
                try {
                    System.out.println("Hello world!");
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
}