package Multithreading.RunnableImpl;


public class Client {
    public static void main(String[] args) {
        System.out.println("Thread : " + Thread.currentThread().getName());

        MultithreadingLearning x = new MultithreadingLearning();

        Thread t = new Thread(() -> System.out.println("Lambda : " + Thread.currentThread().getName()));

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable : " + Thread.currentThread().getName());
            }
        };
//        Thread t2=new Thread(x);
        Thread t2 = new Thread(r);

        t.start();
        t2.start();
        System.out.println("Inside Client : " + Thread.currentThread().getName());
    }
}
