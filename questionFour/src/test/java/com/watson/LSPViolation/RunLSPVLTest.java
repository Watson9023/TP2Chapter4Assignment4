package com.watson.LSPViolation;

import com.watson.OCPFix.Before;
import com.watson.OCPFix.Test;
import junit.framework.Assert;
import junit.framework.TestCase;

public class RunLSPVLTest extends TestCase {

    Square sqr;
    Rectangle rect;
    @Before
    public void setUp() throws Exception {
        sqr = new Square();
        rect = new Rectangle();
    }

    @Test
    public void testSetWidth() throws Exception {
        sqr.setWidth(25);
        Assert.assertEquals(25,25);
        rect.setWidth(27);
        Assert.assertEquals(27,27);
    }

    @Test
    public void testSetHeight() throws Exception
    {
        sqr.setHeight(25);
        Assert.assertEquals(25,25);
        rect.setHeight(93);
        Assert.assertEquals(93,93);
    }

    @Test
    public void testGetWidth() throws Exception
    {
        rect.setWidth(25);
        Assert.assertEquals(25,rect.getWidth());
    }

    @Test
    public void testGetHeight() throws Exception {
        rect.setHeight(93);
        Assert.assertEquals(93,rect.getHeight());
    }

    @Test
    public void testGetArea() throws Exception
    {
        rect.setWidth(5);
        rect.setHeight(10);
        Assert.assertEquals(50,rect.getArea());
    }

}