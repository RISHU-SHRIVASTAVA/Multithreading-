package Multithreading.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {

        ReentrantLock lock=new ReentrantLock();

        SharedResource res1=new SharedResource();

        Thread t1= new Thread(()->{
            res1.producer(lock);
        });

        SharedResource res2=new SharedResource();

        Thread t2= new Thread(()->{
            res2.producer(lock);
        });

        t1.start();
        t2.start();

    }
}
