package com.example;

public class taskHello1 implements Runnable {   
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(" Hi from thread " + t.getId());
        System.out.println("THREAD name : " + t.getName());
        System.out.println(" id : " + t.getId());
        System.out.println(" Priority : " + t.getPriority());
        System.out.println("State : " + t.getState());
        System.out.println("Thread group: " + t.getThreadGroup().getName());
        System.out.println("----------------");
    }

    public static void main(String[] args){
        taskHello1 taskHello = new taskHello1();
        Thread thread1 = new Thread(taskHello);
        Thread thread2 = new Thread(taskHello);
        thread1.run();
        thread2.run();
    }
    
}
