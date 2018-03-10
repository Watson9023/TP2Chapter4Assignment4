package com.watson.OCPViolation;

public class RunOcpVL {
    public static void main(String[] args)
    {
        Shape rect = new Rectangle();
        Shape circle = new Circle();
        GraphicEditor graphic = new GraphicEditor();
        graphic.drawShape(circle);
        graphic.drawShape(rect);
    }

}
