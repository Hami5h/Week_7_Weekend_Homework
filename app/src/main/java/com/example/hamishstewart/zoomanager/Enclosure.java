package com.example.hamishstewart.zoomanager;

import java.util.ArrayList;

/**
 * Created by hamishstewart on 10/11/2017.
 */

public class Enclosure<T extends Animal> {
    private ArrayList<T> animals;

    public Enclosure() {
        this.animals = new ArrayList();
    }


    public void addAnimal(T animal) {
        this.animals.add(animal);
    }

    public void removeAnimal(T animal) {
        this.animals.remove(animal);
    }


    public int getSize() {
        return this.animals.size();
    }

    public double calculateValue() {
        double value = 0;
        for (T animal : animals) {
            value += animal.getValue();
        }
        return value;
    }
}
