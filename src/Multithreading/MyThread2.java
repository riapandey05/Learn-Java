package Multithreading;

public class MyThread2 extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running......");
        for(int i=1;i<=5;i++){

            System.out.println(Thread.currentThread().getName() + "is running");
            Thread.yield();
//👉 It is only a hint to the thread scheduler
//👉 It means: “I’m willing to pause if someone else of same priority wants to run”
//👉 The scheduler is free to ignore it
//
//📌 There is NO guarantee that another thread will run immediately.

        }
    }


    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
    }

//A user thread is a normal thread that keeps the JVM alive.
//👉 JVM will NOT exit as long as at least one user thread is running.



//A daemon thread is a background/helper thread that does NOT prevent JVM shutdown.
//👉 JVM automatically terminates daemon threads when:
//All user threads finish execution
//Examples of daemon threads:
//Garbage Collector (GC)