package com.watson.ObeyingDesignPrinciples.LSP;

import com.watson.ObeyingDesignPrinciples.DIP.Before;
import com.watson.ObeyingDesignPrinciples.DIP.Test;

public class TransportationDeviceTest {

    Car myCar;
    Bicycle myBike;

    @Before
    public void setUp() throws Exception {
        myCar = new Car();
        myBike = new Bicycle();

    }

    @Test
    public void testMovement() throws Exception {
        myCar.startEngine();
        myBike.startMoving();
    }
}
