package main.java.org.example;

public class Main {
    public static void main(String[] args) {
        //System.out.println("¿Cuántas veces quieres que se repita Goodbye world?");
        //Scanner scanner = new Scanner(System.in);
        //int times = scanner.nextInt();
        //Thread helloThread = new Thread(new HelloWorldTask(50));
        //Thread goodbyeThread = new Thread(new GoodbyeWorldTask(times));
        //helloThread.start();
        //goodbyeThread.start();

        Thread repeatMessageTask = new Thread(new RepeatMessageTask(50, 10, "Hello! Goodbye!"));
        repeatMessageTask.start();
    }
}