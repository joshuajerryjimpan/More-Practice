package com.triplej.extend;

public class Student {
    String id;
    String name;
    int chinese;
    int japanese;
    int english;
    public Student(){
        super();
    }
    public Student(String id, String name, int chinese, int japanese, int english){
        this.id = id;
        this.name = name;
        this.chinese = chinese;
        this.japanese = japanese;
        this.english = english;
    }
    public void print(){
        System.out.println(id+"\t"+name+"\t"+chinese+"\t"+japanese+"\t"+english);
    }
}
