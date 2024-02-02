package Multithreading.ProducerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {

    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        sharedBuffer=new LinkedList<>();
        this.bufferSize=bufferSize;
    }

    public synchronized void producer(int item) throws Exception{
        //if buffer is full, wait for the consumer to consume items
        while(sharedBuffer.size()==bufferSize){
            System.out.println("Buffer is full, Producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Producer : "+item);
        //Notify the consumer that there are items to consumer now
        notify();
    }

    public synchronized void consumer() throws Exception{
        //Buffer is empty, wait for the producer to produce items
        while (sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty, Consumer is waititng for producer");
            wait();
        }
        int item=sharedBuffer.poll();
        System.out.println("Consumer : "+item);
        //Notify the producer that there is space in the buffer now
        notify();

    }
}
