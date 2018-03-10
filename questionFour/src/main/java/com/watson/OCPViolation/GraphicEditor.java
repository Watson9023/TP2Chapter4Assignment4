package com.watson.OCPViolation;

public class GraphicEditor {

    public void drawShape(Shape s)
    {
        if(s.type == 1)
        {
            drawRectangle();
        }
        else if(s.type == 2)
        {
            drawCircle();
        }
    }

    public void drawCircle()
    {
        System.out.println("It is supposed to be a circle");
    }

    public void drawRectangle()
    {
        System.out.println("It is supposed to be a Rectangle");
    }

}
