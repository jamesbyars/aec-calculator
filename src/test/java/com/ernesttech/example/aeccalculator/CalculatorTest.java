package com.ernesttech.example.aeccalculator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void shouldSumOneAndTwoEqualsThree() {
        assertThat(calculator.sum(1, 2), is(3));
    }

    @Test
    public void shouldSumZeroAndOneEqualsOne() {
        assertThat(calculator.sum(0, 1), is(1));
    }

    @Test
    public void shouldSubtract5From10Equal5() {
        assertThat(calculator.subtract(10, 5), is(5));
    }

}