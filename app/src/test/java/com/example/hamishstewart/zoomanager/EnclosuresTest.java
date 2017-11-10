package com.example.hamishstewart.zoomanager;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by hamishstewart on 10/11/2017.
 */

public class EnclosuresTest {
    Enclosure<Lion> lionEnclosure;
    Enclosure<Elephant> elephantEnclosure;
    Enclosure<Giraffe> giraffeEnclosure;
    Lion lion;
    Lion lion2;
    Giraffe giraffe;
    Elephant elephant;


    @Before
    public void before() {
        lionEnclosure = new Enclosure();
        elephantEnclosure = new Enclosure();
        giraffeEnclosure = new Enclosure();
        lion = new Lion(750.50);
        lion2 = new Lion(800.00);
    }

    @Test
    public void canGetSizeOfEnclosure() {
        assertEquals(0, lionEnclosure.getSize());
        assertEquals(0, elephantEnclosure.getSize());
        assertEquals(0, giraffeEnclosure.getSize());
    }

    @Test
    public void canAddAnimal() {
        lionEnclosure.addAnimal(lion);
        assertEquals(1, lionEnclosure.getSize());
    }

    @Test
    public void canRemoveAnimal() {
        lionEnclosure.addAnimal(lion);
        assertEquals(1, lionEnclosure.getSize());
        lionEnclosure.removeAnimal(lion);
        assertEquals(0, lionEnclosure.getSize());
    }

    @Test
    public void canCalculateValue() {
        lionEnclosure.addAnimal(lion);
        lionEnclosure.addAnimal(lion2);
        assertEquals(1550.50, lionEnclosure.calculateValue(), 0.01);
    }

}


