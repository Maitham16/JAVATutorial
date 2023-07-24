package Multithreding;

class MyThread extends Thread {
    public MyThread(Counter counter) {
    }

    public MyThread() {
    }

    public void run(){
       System.out.println("Thread is running...");
    }
}
