package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlanetTest {

    private Planet myPlanet;

    @Before
    public void setup(){
        myPlanet = new Planet("Venus", 3245);

    }

    @Test
    public void planatHasName(){
        assertEquals("Venus", myPlanet.getName());
    }
}
