package com.triplej.horse3;

public class HorseRunnable implements Runnable{
    public void run(){
        for(int i = 0; i < 10000; i++){
            System.out.println("HR"+" "+i);
        }
    }
}
