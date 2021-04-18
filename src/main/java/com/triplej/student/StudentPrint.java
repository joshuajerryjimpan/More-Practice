package com.triplej.student;

import com.triplej.student.Student;

public class StudentPrint {
    public static void main(String[] args){
        Student a = new Student("409570028", "Joshua", 100, 70,60);
        Student b = new Student("409241354", "Angel", 80, 100, 90);
        a.print();
        b.print();
    }
}
