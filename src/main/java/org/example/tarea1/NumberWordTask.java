package main.java.org.example.tarea1;

public class NumberWordTask implements Runnable {

    private final int n;
    private final String word;

    public NumberWordTask(int n, String word) {
        this.n = n;
        this.word = word;
    }

    @Override
    public void run() {
        for (int i = 0; i < n; i++) {
            try {
                System.out.println(word);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}