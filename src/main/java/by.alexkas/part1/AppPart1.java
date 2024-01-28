package by.alexkas.part1;

/**
 * Варианты создагия потоков
 */

public class AppPart1 {
    public static void main(String[] args) {

        //создание потока через extends Thread
        StudyThread1 thread1 = new StudyThread1();
        StudyThread2 thread2 = new StudyThread2();

        //создание потока через implements Runnable
        Thread thread3 = new Thread(new StudyThread3());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

