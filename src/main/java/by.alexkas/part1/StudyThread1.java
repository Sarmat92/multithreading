package by.alexkas.part1;

public class StudyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Study Thread 1: " + i);
        }
    }
}
