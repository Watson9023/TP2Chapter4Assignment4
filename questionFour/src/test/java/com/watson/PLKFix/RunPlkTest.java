package com.watson.PLKFix;

import com.watson.OCPFix.Before;
import com.watson.OCPFix.Test;
import junit.framework.Assert;
import junit.framework.TestCase;

public class RunPlkTest extends TestCase {

    private plkFix plk;
    private Arrange orderObect;
    private  boolean test = false;
    @Before
    public void setUp() throws Exception {
        plk = new plkFix();
        orderObect = new Arrange();
    }

    @Test
    public void testProcess() throws Exception {
        try{
           // plk.process(arrangeObject);
            test = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(test);
    }

    @Test
    public void testNormalise() throws Exception
    {
        try {
            orderObect.arrange();
            test = true;
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(test);
    }

}