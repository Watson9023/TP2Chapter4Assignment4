package com.watson.ObeyingDesignPrinciples.LSP;

public class Car extends DeviceWithEngines{

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.print("Car: Car engine started\n");

    }
}
