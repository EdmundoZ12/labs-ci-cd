package com.cicd.webapi.Services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorServiceTest {

    private final CalculatorService calculatorService =
            new CalculatorService();

    @Test
    void shouldAddTwoNumbers() {
        int result = calculatorService.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        int result = calculatorService.subtract(10, 4);

        assertEquals(6, result);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        int result = calculatorService.multiply(3, 4);

        assertEquals(12, result);
    }

    @Test
    void shouldDivideTwoNumbers() {
        double result = calculatorService.divide(10, 2);
        assertEquals(5, result);
//
//        IllegalArgumentException exception = assertThrows(
//                IllegalArgumentException.class,
//                () -> calculatorService.divide(10, 0));
//
//        assertEquals("Division by zero", exception.getMessage());

    }
}