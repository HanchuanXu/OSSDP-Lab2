package org.example;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class L2021112946_17_Test {
    @Test
    public void test1(){
        Solution solution = new Solution();
        String from = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expected = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        List<String> result = solution.findRepeatedDnaSequences(from);

        assertEquals(expected, result);
    }
    @Test
    public void test2(){
        Solution solution = new Solution();
        String from = "AAAAAAAAAAAAA";
        List<String> expected = Arrays.asList("AAAAAAAAAA");
        List<String> result = solution.findRepeatedDnaSequences(from);

        assertEquals(expected, result);
    }
}
