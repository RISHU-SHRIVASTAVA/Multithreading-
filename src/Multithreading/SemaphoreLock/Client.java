package Multithreading.SemaphoreLock;


public class Client {
    public static void main(String[] args) {


        SharedResource res = new SharedResource();

        Thread t1 = new Thread(res::producer);

        Thread t2 = new Thread(res::producer);

        Thread t3 = new Thread(res::producer);

        Thread t4 = new Thread(res::producer);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
