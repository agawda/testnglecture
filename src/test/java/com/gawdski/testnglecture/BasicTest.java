package com.gawdski.testnglecture;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasicTest {

    @Test
    public void addPassingTest() {
        Basic basic = new Basic();
        int result = 2;
        assertEquals(basic.add(1, 1), result);
    }

    @Test
    public void addFailingTest () {
        Basic basic = new Basic();
        int result = 3;
        assertNotEquals(basic.add(1, 1), result);
    }

    @Test
    public void booleanPassingTest () {
        Basic basic = new Basic();
        assertTrue(basic.retTrue());
    }

    @Test
    public void booleanFailingTest () {
        Basic basic = new Basic();
        assertFalse(basic.retFalse(), "not false :<");
    }
}
