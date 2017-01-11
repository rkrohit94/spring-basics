package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/01/17.
 */
public class MathTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldSquareAnInteger() throws Exception {
        int results = Math.square(4);
        assertEquals(16, results);

    }

    @Test
    public void shouldReturnFactorial() throws Exception {
        int result =Math.factorial(5);
        System.out.println(result);
        assertEquals(120,result);
    }

    @Test
    public void shouldReturnFibonacciNumber() throws Exception {
        int result =Math.fibonacci(15);
        System.out.println(result);
        assertEquals(610,result);
    }
}