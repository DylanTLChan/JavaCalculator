package main.java;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator cal = new Calculator();
    @Test
    public void add()
    {
        int num1 = 2;
        int num2 = 3;
        assertEquals(5,cal.add(num1,num2));
    }

    @Test
    public void sub() {

        int num1=20;
        int num2=5;
        assertEquals(15,cal.sub(num1,num2));
    }

    @Test
    public void mult() {

        int num1 = 5;
        int num2 = 5;
        assertEquals(25,cal.mult(num1,num2));
    }

    @Test
    public void div() {
        int num1 = 150;
        int num2 = 10;
        assertEquals(15, cal.div(num1,num2));
    }
}