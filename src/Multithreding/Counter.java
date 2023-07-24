package Multithreding;

class Counter{
    int count;

    // synchronized method
    public synchronized void increment(){
        count++;
        System.out.println(count);
    }
}