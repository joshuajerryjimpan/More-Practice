package com.triplej.extend;

public class Tester {
    public static void main(String[] args){
        Student stu = new Student("1962","Takuya Kai", 80, 100, 60 );
        stu.print();
        GraduateStudent gst = new GraduateStudent("5131", "Suzuki Ichiro", 90, 100, 100, 70);
        gst.print();

    }
}
