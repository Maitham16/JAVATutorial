package Multithreding;

public class MainMultiThreading {

    // main method
    public static void main(String[] args) {
        // creating object of MyRunnable class
        MyRunnable myRunnable = new MyRunnable();
        // creating object of Thread class
        Thread thread = new Thread(myRunnable);
        // starting thread
        thread.start();
        // creating object of MyThread class
        MyThread myThread = new MyThread();
        // starting thread
        myThread.start();
        // creating object of Counter class
        Counter counter = new Counter();
        // creating object of MyThread class
        MyThread myThread1 = new MyThread(counter);
        // creating object of MyThread class
        MyThread myThread2 = new MyThread(counter);
        // starting thread
        myThread1.start();
        // starting thread
        myThread2.start();
        // waiting for myThread1 to die
        try {
            myThread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // waiting for myThread2 to die
        try {
            myThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // printing count
        System.out.println(counter.count);
    }
    
}
