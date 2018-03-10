package com.watson.ObeyingDesignPrinciples.SRP;

import com.watson.ObeyingDesignPrinciples.DIP.Before;
import com.watson.ObeyingDesignPrinciples.DIP.Test;
import junit.framework.TestCase;

public class TextTest extends TestCase {

    Text text;
    Printer printer;

    @Before
    public void setUp() throws Exception {
        text = new Text();
        printer = new Printer(text);
    }

    @Test
    public void testPrinter() throws Exception {
        text.setAuthor("Lindi Moses");
        text.setText("The love song");
        text.setLength(500);
        printer.printText();
    }
}