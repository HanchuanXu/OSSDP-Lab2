package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class L190200102_Solution10_Test {

    @Test
    public void testFractionAddition() {
        Solution10 solution = new Solution10();

        // Test Case 1
        String expression1 = "-1/2+1/2";
        String result1 = solution.fractionAddition(expression1);
        assertEquals("0/1", result1);

        // Test Case 2
        String expression2 = "-1/2+1/2+1/3";
        String result2 = solution.fractionAddition(expression2);
        assertEquals("1/3", result2);

        // Test Case 3
        String expression3 = "1/3-1/2";
        String result3 = solution.fractionAddition(expression3);
        assertEquals("-1/6", result3);

        // Additional Test Case
        String expression4 = "1/2+1/4+1/8";
        String result4 = solution.fractionAddition(expression4);
        assertEquals("7/8", result4);
    }
}

