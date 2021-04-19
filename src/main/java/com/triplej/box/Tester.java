package com.triplej.box;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter object\'s length: ");
        int length = Integer.parseInt(scan.next());
        System.out.println("Please enter object\'s width: ");
        int width = Integer.parseInt(scan.next());
        System.out.println("Please enter object\'s height: ");
        int height = Integer.parseInt(scan.next());
        System.out.println("length : "+length+", width: "+width+", height, "+height);
        if(length < 20 && width <= 20 && height <= 20){
            System.out.println("It is Box1, price: 50");
        }else if(length > 20 && width >= 20 && height >= 20){
            System.out.println("It is Box2, price: 200");
        }
    }
}
