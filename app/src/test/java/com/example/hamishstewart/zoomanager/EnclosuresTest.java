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

    @Before
    public void before() {
        lionEnclosure = new Enclosure();
        elephantEnclosure = new Enclosure();
        giraffeEnclosure = new Enclosure();
    }

    @Test
    public void canGetSizeOfEnclosure() {
        assertEquals(0, lionEnclosure.getSize());
        assertEquals(0, elephantEnclosure.getSize());
        assertEquals(0, giraffeEnclosure.getSize());
    }

}


