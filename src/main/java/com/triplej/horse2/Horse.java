package com.triplej.horse2;

public class Horse extends Thread{
    public void run(){
        for(int i = 0; i < 10000; i++){
            System.out.println(getName()+" "+i);
        }
    }
}
