package com.triplej.horse3;

public class Racing {
    public static void main(String[] args){
        Horse h1 = new Horse();
        Horse h2 = new Horse();
        HorseRunnable h3 = new HorseRunnable();
        Thread thr = new Thread();
        thr.start();
        h1.start();
        h2.start();
    }
}
