package com.gawdski.testnglecture;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class SoftAssertionTest {
    private SoftAssert softAssert = new SoftAssert();

    @Test
    public void testSoft () {
        softAssert.assertTrue(false, "failed");
        softAssert.assertTrue(true, "true");
        softAssert.assertEquals(1, 2, "numbers");
        softAssert.assertAll();
    }

    @Test
    public void testHard () {
        assertEquals(1, 2);
        assertEquals(1, 1);
    }
}
