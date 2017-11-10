package com.example.hamishstewart.zoomanager;

/**
 * Created by hamishstewart on 10/11/2017.
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZooTest {
    Zoo zoo;
    Enclosure enclosure;
    Enclosure<Lion> lionEnclosure;
    Enclosure<Elephant> elephantEnclosure;
    Enclosure<Giraffe> giraffeEnclosure;
    Lion lion;
    Lion lion2;
    Giraffe giraffe;
    Elephant elephant;

    @Before
    public void before() {
        zoo = new Zoo();
        lionEnclosure = new Enclosure();
        elephantEnclosure = new Enclosure();
        giraffeEnclosure = new Enclosure();
        lion = new Lion(750.50);
        lion2 = new Lion(800.00);

    }

    @Test
    public void canGetNumberOfEnclosures() {
        assertEquals(0, zoo.getSize());
    }

    @Test
    public void canAddEnclosure() {
        zoo.addEnclosure(giraffeEnclosure);
        zoo.addEnclosure(lionEnclosure);
        assertEquals(2, zoo.getSize());
    }

    @Test
    public void canGetTotalNumberOfAnimals() {
        lionEnclosure.addAnimal(lion);
        lionEnclosure.addAnimal(lion2);
       giraffeEnclosure.addAnimal((giraffe));
       elephantEnclosure.addAnimal(elephant);
        zoo.addEnclosure(giraffeEnclosure);
        zoo.addEnclosure(lionEnclosure);
        zoo.addEnclosure(elephantEnclosure);
        assertEquals(3, zoo.getSize());
        assertEquals(4, zoo.totalNumberOfAnimals());

    }

}
