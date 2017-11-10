package com.example.hamishstewart.zoomanager;

import java.util.ArrayList;

/**
 * Created by hamishstewart on 10/11/2017.
 */

public class Zoo {
    private ArrayList<Enclosure> enclosures;

    public Zoo() {
        this.enclosures = new ArrayList();
    }

    public void addEnclosure(Enclosure enclosure) {
        this.enclosures.add(enclosure);
    }

    public void removeEnclosure(Enclosure enclosure) {
        this.enclosures.remove(enclosure);
    }

    public int getSize() {
        return this.enclosures.size();
    }

    public int totalNumberOfAnimals() {
        int total = 0;
        for (Enclosure enclosure : enclosures) {
            total += enclosure.getSize();
        }
        return total;
    }


}
