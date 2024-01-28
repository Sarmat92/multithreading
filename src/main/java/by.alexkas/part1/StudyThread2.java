package by.alexkas.part1;

public class StudyThread2 extends Thread {
    public void run() {
        for (int i = 100; i > 0; i--) {
            System.out.println(i);
        }
    }
}
