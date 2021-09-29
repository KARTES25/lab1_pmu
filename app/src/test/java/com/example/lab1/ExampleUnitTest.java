package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExampleUnitTest {
    @Test
    public void max_test_1() {
        assertEquals(1, MainActivity.max(1));
    }
    @Test
    public void max_test_2() {
        assertEquals(5, MainActivity.max(1, 5));
    }
    @Test
    public void max_test_3() {
        assertEquals(10, MainActivity.max(5, 10, -10));
    }
    @Test
    public void max_test_4() {
        assertEquals(373, MainActivity.max(2, 23, 66, 1, 66, 48, 373, 3));
    }
    @Test
    public void max_test_5() {
        assertEquals(-10, MainActivity.max(-50, -20, -10, -99));
    }
    @Test
    public void min_test_1() {
        assertEquals(5, MainActivity.min(5));
    }
    @Test
    public void min_test_2() {
        assertEquals(0, MainActivity.min(5, 0));
    }
    @Test
    public void min_test_3() {
        assertEquals(1, MainActivity.min(3, 152, 1));
    }
    @Test
    public void min_test_4() {
        assertEquals(1, MainActivity.min(2, 23, 66, 1, 66, 48, 373, 3));
    }
    @Test
    public void min_test_5() {
        assertEquals(-199, MainActivity.min(-50, -20, -10, -199));
    }
}