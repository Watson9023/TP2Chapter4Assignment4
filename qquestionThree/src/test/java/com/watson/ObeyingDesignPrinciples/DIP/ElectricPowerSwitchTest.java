package com.watson.ObeyingDesignPrinciples.DIP;

import junit.framework.TestCase;

public class ElectricPowerSwitchTest extends TestCase {

    Switchable switchableBulb;
    Switchable switchableFan;
    Switch bulbPowerSwitch;
    Switch fanPowerSwitch;

    @Before
    public void setUp() throws Exception {
        switchableBulb   = new LightBulb();
        switchableFan = new Fan();
        bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);
        fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
    }

    @Test
    public void testPress() throws Exception {
        bulbPowerSwitch.press();
        bulbPowerSwitch.press();
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}