package com.example.hamishstewart.zoomanager;

/**
 * Created by hamishstewart on 10/11/2017.
 */

public abstract class Animal {
    private double value;

    public Animal(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }
}
