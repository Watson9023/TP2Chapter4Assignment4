package com.watson.OCPFix;

import junit.framework.Assert;
import junit.framework.TestCase;

public class RunOcpTest extends TestCase {

    GraphicEditor graph;
    Shape rect;
    Shape shape;
    @Before
    public void setUp() throws Exception {
        graph = new GraphicEditor();
        rect = new Rectangle();
    }

    @Test
    public void testDrawShape() throws Exception {
        boolean test = false;
        try {
            graph.drawShape(rect);
            test = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        Assert.assertTrue(test);
    }

}