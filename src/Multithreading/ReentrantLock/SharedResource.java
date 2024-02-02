package Multithreading.ReentrantLock;


import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    public void producer(ReentrantLock lock){
        try{
            lock.lock();
            System.out.println("Produces ");
        }
        catch (Exception e){
            //Exception handling
        }
        finally {
            lock.unlock();
        }
    }
}
