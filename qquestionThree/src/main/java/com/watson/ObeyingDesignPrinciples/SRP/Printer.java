package com.watson.ObeyingDesignPrinciples.SRP;


public class Printer {

    Text text;

    public Printer(Text text) {

        this.text = text;
    }
    public void printText(){
        System.out.print("Text sent to printer for printing");

    }
}
