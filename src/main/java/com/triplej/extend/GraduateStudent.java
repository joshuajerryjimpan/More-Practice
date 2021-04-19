package com.triplej.extend;

public class GraduateStudent extends Student{
    int french;
    public GraduateStudent(String id, String name, int chinese, int japanese, int english, int french){
        super(id, name, chinese, japanese, english);
        this.french = french;
    }
    public void print(){
        System.out.println(id+"\t"+name+"\t"+chinese+"\t"+japanese+"\t"+english+"\t"+french);}
}
