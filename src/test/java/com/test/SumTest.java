package com.test;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class SumTest {

    @Test
    public void testAdd() {
        int a = 2;
        int b = 3;
        Calculator calculator = new Calculator();
        int result = calculator.sum(a,b);
        assertThat(5,IsEqual.equalTo(result));
    }

}
