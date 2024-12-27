package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayUtilsTest {
    @Test
    public void testPositiveNumbers() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(5, ArrayUtils.findMax(array));
        System.out.println(ArrayUtils.findMax(array));
    }

    @Test
    public void testNegativeNumbers() {
        int[] array = {-1, -2, -3, -4, -5};
        assertEquals(-1, ArrayUtils.findMax(array));
        System.out.println(ArrayUtils.findMax(array));
    }

    @Test
    public void testMixedNumbers() {
        int[] array = {-10, 0, 10, 5};
        assertEquals(10, ArrayUtils.findMax(array));
        System.out.println(ArrayUtils.findMax(array));
    }

    @Test
    public void testSingleElementArray() {
        int[] array = {42};
        assertEquals(42, ArrayUtils.findMax(array));
        System.out.println(ArrayUtils.findMax(array));
    }

    @Test
    public void testThrowsExceptionForEmptyArray() {
        int[] array = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMax(array));
        System.out.println(ArrayUtils.findMax(array));
    }
}