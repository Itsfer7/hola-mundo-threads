package main.java.org.example;

public class RepeatMessageTask implements Runnable {

    private final int times;
    private final int miliseconds;
    private final String message;

    public RepeatMessageTask(int times, int miliseconds, String message) {
        this.times = times;
        this.miliseconds = miliseconds;
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            try {
                System.out.println(message);
                Thread.sleep(miliseconds);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}