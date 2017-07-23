package com.test;

import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class SumTest {

    private Calculator calculator;
    int a;
    int b;

    @Before
    public void setup(){
        a = 3;
        b = 2;
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.sum(a,b);
        assertThat(5,IsEqual.equalTo(result));
    }

    @Test
    public void testSubstruction(){
        int result = calculator.substruct(a,b);
        assertThat(1,IsEqual.equalTo(result));
    }

    @Test
    public void testMultiply(){
        int result = calculator.multiply(a,b);
        assertThat(6,IsEqual.equalTo(result));
    }
}
