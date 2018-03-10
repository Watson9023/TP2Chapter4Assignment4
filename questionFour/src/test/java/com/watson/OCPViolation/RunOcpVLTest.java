package com.watson.OCPViolation;

import com.watson.OCPFix.Before;
import com.watson.OCPFix.Test;
import junit.framework.Assert;
import junit.framework.TestCase;

public class RunOcpVLTest extends TestCase {

    Shape shapeObject;
    Circle circleObject;
    Rectangle rectangleObject;
    GraphicEditor graphic;

    @Before
    public void setUp() throws Exception {
        shapeObject = new Shape();
        circleObject = new Circle();
        rectangleObject = new Rectangle();
        graphic = new GraphicEditor();
    }

    @Test
    public void testDrawShape() throws Exception
    {
        boolean test = false;
        try {
            shapeObject.type = 1;
            graphic.drawShape(shapeObject);
            test = true;
            Assert.assertTrue(test);
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Test
    public void testDrawShape2() throws Exception {
        boolean test = false;
        try {
            shapeObject.type = 2;
            graphic.drawShape(shapeObject);
            test = true;
            Assert.assertTrue(test);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}