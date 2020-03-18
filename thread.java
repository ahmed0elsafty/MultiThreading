package com.company;

public class thread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+"        "+(i+1)+"     "+Thread.currentThread().getPriority());
        }
    }
}
