package com.watson.LSPViolation;

public class RunLSPVL {

    private static Rectangle getNewRectangle()
    {
        return new Square();
    }

    public static void main(String[] args) {
        Rectangle r = RunLSPVL.getNewRectangle();
        r.setHeight(5);
        r.setWidth(10);
        System.out.println(r.getArea());
    }
}
