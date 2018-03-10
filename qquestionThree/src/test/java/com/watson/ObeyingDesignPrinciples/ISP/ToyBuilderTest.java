package com.watson.ObeyingDesignPrinciples.ISP;

import com.watson.ObeyingDesignPrinciples.DIP.Test;
import junit.framework.TestCase;

public class ToyBuilderTest extends TestCase {

    @Test
    public void testBuildToyHouse() throws Exception {
        ToyHouse toyHouse = ToyBuilder.buildToyHouse();
        System.out.print(toyHouse);
    }

    @Test
    public void testBuildToyCar() throws Exception {
        ToyCar toyCar = ToyBuilder.buildToyCar();
        System.out.print(toyCar);
    }

    @Test
    public void testBuildToyPlane() throws Exception {
        ToyPlane toyPlane = ToyBuilder.buildToyPlane();
        System.out.print(toyPlane);
    }
}