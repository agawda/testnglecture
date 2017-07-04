package com.gawdski.testnglecture;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestFixture {
    Basic basic;
    @BeforeTest
    public void fixture() {
        basic = new Basic();
    }

    @Test
    public void addTest () {
        assertEquals(basic.add(1, 1), 2);
    }

    @Test
    public void booleanTest () {
        assertTrue(basic.retTrue());
    }
}
