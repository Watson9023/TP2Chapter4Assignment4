package com.watson.ObeyingDesignPrinciples.DIP;

public class LightBulb implements Switchable {

    public void turnOn() {
        System.out.println("LightBulb: Bulb is turned on...");
    }

    public void turnOff() {
        System.out.println("LightBulb: Bulb is turned off...");
    }
}
