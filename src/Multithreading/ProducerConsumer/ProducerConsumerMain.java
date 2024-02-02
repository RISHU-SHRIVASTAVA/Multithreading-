package Multithreading.ProducerConsumer;

public class ProducerConsumerMain {

    public static void main(String[] args) {

        SharedResource sharedResourceObj= new SharedResource(3);

        Thread producerThread= new Thread(()->{
           try {
               for(int i=1;i<=5;i++){
                   sharedResourceObj.producer(i);
               }
           }
           catch (Exception e){
               //Exception handles here
           }
        });

        Thread consumerThread= new Thread(()->{
           try {
               for(int i=1;i<=5;i++){
                   sharedResourceObj.consumer();
               }
           }
           catch (Exception e){
               //Exception handles here
           }
        });

        producerThread.start();
        consumerThread.start();


    }
}
