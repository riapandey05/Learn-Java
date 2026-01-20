package Multithreading;

public class MyThread extends Thread {
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Thread is running.........");
       for(int i=1;i<=5;i++){
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Thread interrupted");
                return;
            }
            System.out.println(Thread.currentThread().getName() + "Priority : "+ Thread.currentThread().getPriority() + " count : "+i);
        }
    }
    public static void main(String[] args){
//        MyThread l = new MyThread("Low priority thread");
//        MyThread m = new MyThread("Mid priority thread");
//        MyThread n = new MyThread("High priority thread");
//        l.setPriority(Thread.MIN_PRIORITY);
//        m.setPriority(Thread.NORM_PRIORITY);
//        n.setPriority(Thread.MAX_PRIORITY);
//        l.start();
//        m.start();
//        n.start();


        MyThread o = new MyThread("o");
        o.start();
        o.interrupt();
//interrupt() is a cooperative way to request a thread to stop what it’s doing.
//It does not forcefully kill a thread.
//Because forcefully stopping a thread is dangerous:
//
//Can leave shared data in an inconsistent state
//
//Can cause deadlocks
//
//Can corrupt memory







        System.out.println("Hello");




//      If we write t1.join() b4 sopln then it will first execute the thread completely then execute this


    }
}
