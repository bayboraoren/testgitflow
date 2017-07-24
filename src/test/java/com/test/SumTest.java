package com.test;

import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class SumTest {

    private Calculator calculator;
    int a;
    int b;
    int addResult;
    int substructionResult;
    int multiplyResult;
    int divisionResult;

    @Before
    public void setup(){
        a = 4;
        b = 2;

        addResult=a+b;
        substructionResult=a-b;
        multiplyResult=a*b;
        divisionResult=a/b;

        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.sum(a,b);
        assertThat(addResult,IsEqual.equalTo(result));
    }

    @Test
    public void testSubstruction(){
        int result = calculator.substruct(a,b);
        assertThat(substructionResult,IsEqual.equalTo(result));
    }

    @Test
    public void testMultiply(){
        int result = calculator.multiply(a,b);
        assertThat(multiplyResult,IsEqual.equalTo(result));
    }

    @Test
    public void testDivision(){
        int result = calculator.division(a,b);
        assertThat(divisionResult,IsEqual.equalTo(result));
    }
}
