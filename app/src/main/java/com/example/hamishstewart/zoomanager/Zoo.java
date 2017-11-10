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



}
