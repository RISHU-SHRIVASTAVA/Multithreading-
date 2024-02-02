package Multithreading.RunnableImpl;


public class ABC implements Runnable {
    @Override
    public void run() {
        System.out.println("Inside Run Method : " + Thread.currentThread().getName());
    }
}