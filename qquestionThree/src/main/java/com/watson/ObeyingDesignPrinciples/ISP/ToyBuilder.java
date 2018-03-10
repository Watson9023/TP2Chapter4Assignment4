package com.watson.ObeyingDesignPrinciples.ISP;

public class ToyBuilder {
    public static ToyHouse buildToyHouse(){
        ToyHouse toyHouse = new ToyHouse();
        toyHouse.setPrice(15.00);
        toyHouse.setColor("Orange");
        return  toyHouse;
    }
    public static ToyCar buildToyCar(){
        ToyCar toyCar = new ToyCar();
        toyCar.setPrice(25.00);
        toyCar.setColor("Purple");
        toyCar.move();
        return toyCar;
    }
    public static ToyPlane buildToyPlane(){
        ToyPlane toyPlane = new ToyPlane();
        toyPlane.setPrice(200.00);
        toyPlane.setColor("Yellow");
        toyPlane.move();
        toyPlane.fly();
        return  toyPlane;
    }
}
