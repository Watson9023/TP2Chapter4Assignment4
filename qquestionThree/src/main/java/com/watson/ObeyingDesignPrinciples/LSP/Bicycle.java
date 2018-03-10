package com.watson.ObeyingDesignPrinciples.LSP;

public class Bicycle extends DeviceWithoutEngines {

    @Override
    public void startMoving() {
        super.startMoving();
        System.out.print("Bicycle: Bicycle is moving");
    }

}
