package com.example.btbuoi4;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class WhiteBoxPracticeTest {

    @Test
    void calculateRectanglePerimeterReturnsCorrectValue() {
        assertEquals(16.0, WhiteBoxPractice.calculateRectanglePerimeter(5, 3));
    }

    @Test
    void calculateRectanglePerimeterAllowsZeroValues() {
        assertEquals(0.0, WhiteBoxPractice.calculateRectanglePerimeter(0, 0));
    }

    @Test
    void calculateRectanglePerimeterRejectsNegativeValues() {
        assertThrows(IllegalArgumentException.class,
                () -> WhiteBoxPractice.calculateRectanglePerimeter(-1, 3));
    }

    @Test
    void calculateRectangleAreaReturnsCorrectValue() {
        assertEquals(20.0, WhiteBoxPractice.calculateRectangleArea(4, 5));
    }

    @Test
    void calculateRectangleAreaAllowsZeroValues() {
        assertEquals(0.0, WhiteBoxPractice.calculateRectangleArea(0, 7));
    }

    @Test
    void calculateRectangleAreaRejectsNegativeValues() {
        assertThrows(IllegalArgumentException.class,
                () -> WhiteBoxPractice.calculateRectangleArea(4, -2));
    }

    @Test
    void solveQuadraticEquationReturnsTwoOrderedRoots() {
        assertArrayEquals(new double[] {1.0, 2.0}, WhiteBoxPractice.solveQuadraticEquation(1, -3, 2));
    }

    @Test
    void solveQuadraticEquationReturnsSingleRoot() {
        assertArrayEquals(new double[] {-1.0}, WhiteBoxPractice.solveQuadraticEquation(1, 2, 1));
    }

    @Test
    void solveQuadraticEquationReturnsNoRealRoots() {
        assertArrayEquals(new double[0], WhiteBoxPractice.solveQuadraticEquation(1, 0, 1));
    }

    @Test
    void solveQuadraticEquationRejectsZeroA() {
        assertThrows(IllegalArgumentException.class,
                () -> WhiteBoxPractice.solveQuadraticEquation(0, 2, 1));
    }

    @Test
    void daysInMonthReturnsCorrectDaysFor31DayMonth() {
        assertEquals(31, WhiteBoxPractice.daysInMonth(1, false));
    }

    @Test
    void daysInMonthReturnsCorrectDaysFor30DayMonth() {
        assertEquals(30, WhiteBoxPractice.daysInMonth(4, false));
    }

    @Test
    void daysInMonthHandlesFebruaryInLeapYear() {
        assertEquals(29, WhiteBoxPractice.daysInMonth(2, true));
    }

    @Test
    void daysInMonthHandlesFebruaryInCommonYear() {
        assertEquals(28, WhiteBoxPractice.daysInMonth(2, false));
    }

    @Test
    void daysInMonthRejectsInvalidMonth() {
        assertThrows(IllegalArgumentException.class, () -> WhiteBoxPractice.daysInMonth(13, false));
    }

    @Test
    void isPrimeReturnsFalseForNumbersLessThanTwo() {
        assertFalse(WhiteBoxPractice.isPrime(1));
    }

    @Test
    void isPrimeReturnsTrueForTwo() {
        assertTrue(WhiteBoxPractice.isPrime(2));
    }

    @Test
    void isPrimeReturnsFalseForEvenCompositeNumber() {
        assertFalse(WhiteBoxPractice.isPrime(4));
    }

    @Test
    void isPrimeReturnsFalseForOddCompositeNumber() {
        assertFalse(WhiteBoxPractice.isPrime(49));
    }

    @Test
    void isPrimeReturnsTrueForPrimeNumber() {
        assertTrue(WhiteBoxPractice.isPrime(29));
    }

    @Test
    void sumFromOneToNReturnsZeroForZero() {
        assertEquals(0L, WhiteBoxPractice.sumFromOneToN(0));
    }

    @Test
    void sumFromOneToNReturnsCorrectSum() {
        assertEquals(15L, WhiteBoxPractice.sumFromOneToN(5));
    }

    @Test
    void sumFromOneToNRejectsNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> WhiteBoxPractice.sumFromOneToN(-1));
    }

    @Test
    void gcdReturnsCorrectValueForPositiveInputs() {
        assertEquals(6, WhiteBoxPractice.gcd(54, 24));
    }

    @Test
    void gcdSupportsNegativeInputs() {
        assertEquals(6, WhiteBoxPractice.gcd(-24, 18));
    }

    @Test
    void gcdReturnsOtherValueWhenOneInputIsZero() {
        assertEquals(5, WhiteBoxPractice.gcd(0, 5));
    }

    @Test
    void gcdRejectsBothZeroValues() {
        assertThrows(IllegalArgumentException.class, () -> WhiteBoxPractice.gcd(0, 0));
    }

    @Test
    void factorialReturnsOneForZero() {
        assertEquals(1L, WhiteBoxPractice.factorial(0));
    }

    @Test
    void factorialReturnsCorrectValue() {
        assertEquals(120L, WhiteBoxPractice.factorial(5));
    }

    @Test
    void factorialRejectsNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> WhiteBoxPractice.factorial(-3));
    }

    @Test
    void sumOfFactorialsReturnsZeroForZero() {
        assertEquals(0L, WhiteBoxPractice.sumOfFactorials(0));
    }

    @Test
    void sumOfFactorialsReturnsCorrectValue() {
        assertEquals(153L, WhiteBoxPractice.sumOfFactorials(5));
    }

    @Test
    void sumOfFactorialsRejectsNegativeInput() {
        assertThrows(IllegalArgumentException.class, () -> WhiteBoxPractice.sumOfFactorials(-1));
    }
}
