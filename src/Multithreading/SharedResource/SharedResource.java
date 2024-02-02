package Multithreading.SharedResource;

public class SharedResource {
    private boolean isItemPresent=false;

    public synchronized void addItem(){
        isItemPresent=true;
        System.out.println("Producer thread calling the notify method : "+ Thread.currentThread().getName());
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("Consumer thread inside consumer item method : "+ Thread.currentThread().getName());
        while(!isItemPresent){
            try{
                System.out.println("Consumer thread is waiting : "+ Thread.currentThread().getName());
                wait(); // release all the monitor lock
            }
            catch (Exception e){
                //exception handling
            }
        }
        System.out.println("Consumer thread consume the item ");
        isItemPresent=false;
    }
}
