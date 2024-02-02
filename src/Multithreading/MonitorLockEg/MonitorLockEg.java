package Multithreading.MonitorLockEg;

public class MonitorLockEg {

    public synchronized void task1() {
        //do something
        try {
            System.out.println("Task 1 before sleep:" + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("Task 1 after sleep :" + Thread.currentThread().getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void task2() {
        System.out.println("Before Synchronized 2 :" + Thread.currentThread().getName());
        synchronized (this) {
            System.out.println("Task 2 :" + Thread.currentThread().getName());
        }
    }

    public void task3() {
        System.out.println("Task 3 :" + Thread.currentThread().getName());
    }
}
