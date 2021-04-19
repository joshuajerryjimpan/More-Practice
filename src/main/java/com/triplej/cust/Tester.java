package com.triplej.cust;

public class Tester {
    public static void main(String[] args){
        Customer cust = new Customer("1025", "Evian", 10000);
        cust.print();
        VipCustomer vip = new VipCustomer("0403", "Cindy", 1000);
        vip.print();
    }
}
