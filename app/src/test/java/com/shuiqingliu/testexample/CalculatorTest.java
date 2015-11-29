package com.shuiqingliu.testexample;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by qingliu on 11/29/15.
 */
public class CalculatorTest {

    private Calculator mCalcuator;

    @Before
    public void setUp() throws Exception {
        mCalcuator = new Calculator();
    }

    @Test
    public void testSum() throws Exception{
        assertEquals(6d,mCalcuator.sum(1d,5d),0);
    }


    @After
    public void tearDown() throws Exception {

    }
}