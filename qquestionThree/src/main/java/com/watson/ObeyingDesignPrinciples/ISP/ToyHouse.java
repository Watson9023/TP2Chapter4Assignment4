package com.watson.ObeyingDesignPrinciples.ISP;

public class ToyHouse implements Toy{

    private double price;
    private String color;

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ToyHouse{" +
                "price=" + price +
                ", color='" + color + '\'' +
                '}' +"\n";
    }
}
