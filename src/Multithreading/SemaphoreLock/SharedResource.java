package Multithreading.SemaphoreLock;


import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    boolean isAvailable=false;
    Semaphore lock= new Semaphore(2);

    public void producer(){
        try{
            lock.acquire();
            System.out.println("Lock acquired by : "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(3000);
        }
        catch (Exception e){
            //Exception handling
        }
        finally {
            lock.release();
            System.out.println("Lock release by :"+Thread.currentThread().getName());
        }
    }
}
