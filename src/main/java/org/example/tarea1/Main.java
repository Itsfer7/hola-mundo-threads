package main.java.org.example.tarea1;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberWordTask(100, "Hola"));
        Thread thread2 = new Thread(new NumberWordTask(50, "Adios"));
        thread1.start();
        thread2.start();
    }
}