package com.gawdski.testnglecture;

import org.testng.annotations.Test;

public class ExpectedExceptionTest {
    @Test(expectedExceptions = IllegalStateException.class)
    public void faultyClassTest () {
        FaultyClass faultyClass = new FaultyClass();
        faultyClass.throwSth();
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void notSoFaulty () {
//        FaultyClass faultyClass = new FaultyClass();
//        faultyClass.dontThrow();
    }
}
