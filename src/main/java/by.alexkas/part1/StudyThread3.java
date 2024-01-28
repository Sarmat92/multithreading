package by.alexkas.part1;

public class StudyThread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Study Thread 3: " + i);
        }
    }
}
