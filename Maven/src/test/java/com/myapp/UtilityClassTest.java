package com.myapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UtilityClassTest {

    @Test
    void testAddition() {
        assertEquals(20, UtilityClass.add(10, 10));
    }

    @Test
    void testSubtraction() {
        assertEquals(5, UtilityClass.sub(10, 5));
        assertEquals(-15, UtilityClass.sub(-10, 5));
    }

    @Test
    void testMultiplication() {
        assertEquals(50, UtilityClass.mul(10, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, UtilityClass.div(10, 5));
    }

}
