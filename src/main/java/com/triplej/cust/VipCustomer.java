package com.triplej.cust;

public class VipCustomer extends Customer{
    float discount = 0.23f;
    public VipCustomer(String id, String name, int amount){
        super(id, name, amount);
    }

    @Override
    public int total() {
        return amount - (int)(amount*discount);
    }
    public void print(){
        System.out.println(id+"\t"+name+"\t"+amount+"\t"+total());
    }
}
