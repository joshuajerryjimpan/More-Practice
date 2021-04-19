package com.triplej.horse;

public class Horse extends Thread{
    public void run(){
        for(int i = 0; i < 10000; i++){
            System.out.println("Horse2 "+i);
        }
    }
}
