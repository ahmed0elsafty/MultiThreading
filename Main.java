package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    {
        thread t0=new thread();t0.setName("t1");t0.setPriority(6);
        thread t1=new thread();t1.setName("t2");t1.setPriority(5);
        thread t2=new thread();t2.setName("t3");t2.setPriority(4);
        thread t3=new thread();t3.setName("t4");t3.setPriority(7);
        thread t4=new thread();t4.setName("t5");t4.setPriority(3);
        thread t5=new thread();t5.setName("t6");t5.setPriority(2);

//Because JVM not guaranteed
        int [] priority={t0.getPriority(),t1.getPriority(),t2.getPriority(),t3.getPriority(),t4.getPriority(),t5.getPriority()};
        thread threads[]={t0,t1,t2,t3,t4,t5};
        Arrays.sort(priority);
        for (int i = 0; i < priority.length; i++) {
            for (int j = 0; j < threads.length; j++) {
                if (threads[j].getPriority()==priority[i]){
                    threads[i].start();
                }
            }
        }
    }
}
