package com.triplej.homework;

public class BackGround {
    String id;
    int consumption;
    int discount;
    public BackGround(String id, int consumption, int discount){
        this.id = id;
        this.consumption = consumption;
        this.discount = discount;
    }
    public void print(){
        System.out.println(id+"\t"+consumption+"\t"+discount+"\t"+total());
    }
    public int total(){
        return consumption - discount;
    }
}
