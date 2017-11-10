package com.example.hamishstewart.zoomanager;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by hamishstewart on 10/11/2017.
 */

public class LionTest {
     Lion lion;

     @Test
    public void canGetValue() {
         lion = new Lion(125);
         assertEquals(125, lion.getValue(), 0.01);
     }


}
