package com.watson.ISPFix;

import com.watson.OCPFix.Before;
import com.watson.OCPFix.Test;
import junit.framework.Assert;
import junit.framework.TestCase;

public class RunLspFixTest extends TestCase {

    private Manager manager;
    private WorkableInterface worker;
    private WorkableInterface superWorker;
    private WorkableInterface robot;
    private boolean test;
    @Before
    public void setUp() throws Exception {
        manager = new Manager();
        worker = new Worker();
        superWorker = new SuperWorker();
        robot = new Robot();
    }

    @Test
    public void testWork() throws Exception {
        try {
            worker.work();
            superWorker.work();
            robot.work();
            test = true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(test);
    }
}