package Multithreading;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
//        CreateThread objectthread = new CreateThread();
//        This is new state of thread lifecycle
//        objectthread.start();
//        Runnable state for thread

        CreateThreadUsingRunnable objectrunnable = new CreateThreadUsingRunnable();
        Thread t1 = new Thread(objectrunnable);
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getState());
        }
    }
}
// run this in infinite loop,we will see random printing , which means thread are being executed simultaneously
