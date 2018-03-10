package com.watson.LSPFix;

public class RunLSP {

    private static Rectangle getNewRectangle()
    {
        return new Rectangle();
    }

    public static void main(String[] args) {

        Rectangle r = RunLSP.getNewRectangle();
        r.setHeight(5);
        r.setWidth(10);
        System.out.println(r.getArea());
    }
}
