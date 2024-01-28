package by.alexkas.part1;

public class AppPart1 {
    public static void main(String[] args) {
        StudyThread1 thread1 = new StudyThread1();
        StudyThread2 thread2 = new StudyThread2();

        thread1.start();
        thread2.start();
    }
}

