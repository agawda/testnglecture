package com.gawdski.testnglecture;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParametrizedTest {

    @DataProvider(name = "addition")
    public Object[][] addition() {
        return new Object[][] {
                {1, 1, 2},
                {2, 2, 4},
                {14, 63, 77}
        };
    }

    @Test(dataProvider = "addition")
    public void additionParametrizedTest (int a, int b, int expected) {
        Basic basic = new Basic();
//        assertEquals(a, b);  //further tests will fail because of this one :<
        assertEquals(basic.add(a, b), expected);
    }
}
