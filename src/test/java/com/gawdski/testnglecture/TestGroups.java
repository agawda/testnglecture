package com.gawdski.testnglecture;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestGroups {
    Operation operation;

    @BeforeGroups(groups = "add")
    public void addSetup() {
        operation = new Add();
    }

    @BeforeGroups(groups = "multiply")
    public void multiplySetup() {
        operation = new Multiply();
    }

    @BeforeGroups(groups = "abc")
    public void abcSetup() {
        operation = new Add();
    }

    @Test(groups = "abc")
    public void abcTest () {
        assertEquals(operation.calculate(1, 1), 2);
    }

    @Test(groups = "add")
    public void addTest () {
        assertEquals(operation.calculate(1, 2), 3);
    }

    @Test(groups = "multiply")
    public void multiplyTest() {
        assertEquals(operation.calculate(1, 2), 2);
    }
}
