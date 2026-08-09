package com.example;
import java.util.Scanner;

public class SecondTimer implements Runnable {
    /*
    Write a runb method that foeve2r:
        - sleeps 1 second, 
        - wakes up, increments the number of seconds by one, prints it, and sleeps again 1 second
    */    

    private int seconds = 0;

    public void run() {
        // to be implemented by the student
    }

    public static void main(String[] args){
        System.out.println("Secconds to wait");
        try (Scanner secin = new Scanner(System.in)) {
            int secontsToWait = secin.nextInt();

            SecondTimer timer = new SecondTimer();
            Thread timerThread = new Thread(timer);

            timerThread.start();

            try {
                Thread.sleep(secontsToWait * 1000);
                timerThread.interrupt();  //Stop the timer
   } catch (InterruptedException e) {
            e.printStackTrace();
   }
        }
    
    }
}



