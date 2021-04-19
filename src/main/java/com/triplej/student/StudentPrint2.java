package com.triplej.student;

public class StudentPrint2 {
    public static void main(String[] args){
        int[]scores = {100, 90, 80, 70, 60};
        Student[] students = {
                new Student("409570028", "Joshua", 100, 70,60),
                new Student("409241354", "Angel", 80, 100, 90),
                new Student("11242001", "J pan", 90, 70, 60),
                new Student("02092002", "Yun yeh", 80, 90, 70)
        };
        for(int i=0; i< students.length; i++){
            students[i].print();
        }
        System.out.println(scores[2]);
    }
}
