package com.watson.DipFix;

import com.watson.OCPFix.Before;
import com.watson.OCPFix.Test;
import junit.framework.Assert;
import junit.framework.TestCase;

public class RunDipTest extends TestCase {

    private Manager manager;
    private SuperWorker sWorker;
    private Worker worker;
    @Before
    public void setUp() throws Exception {
        manager = new Manager();
        sWorker = new SuperWorker() {
            public void eat() {

            }
        };
        worker = new Worker();
    }

    @Test
    public void testSetWorker() throws Exception
    {
        manager.setWorker(worker);
        Assert.assertEquals(worker,worker);
    }

}