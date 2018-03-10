package com.watson.ISPViolation;

import com.watson.OCPFix.Before;
import com.watson.OCPFix.Test;
import junit.framework.Assert;
import junit.framework.TestCase;

public class RunIspVLTest extends TestCase {

    private WorkerInterface worker;
    private WorkerInterface superWorker;
    private Manager manager;
    private boolean test = false;


    @Before
    public void setUp() throws Exception {

        worker = new Worker();
        superWorker = new Worker();
        manager = new Manager();
    }

    @Test
    public void testWork() throws Exception {
        try {
            worker.work();
            superWorker.work();
            test = true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(test);
    }

    @Test
    public void testEat() throws Exception {
        try {
            worker.eat();
            superWorker.eat();
            test = true;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        Assert.assertTrue(test);
    }
}