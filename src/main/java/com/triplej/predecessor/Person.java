package com.triplej.predecessor;

public class Person {
    float weight;
    float height;
    public Person(float weight, float height){
        this.weight = weight;
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
