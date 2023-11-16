import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * L学号_X_Test.java
 *
 * Testing principles:
 * - Equivalence class partitioning: Identify different classes of input that should be tested together.
 * - Boundary value analysis: Include test cases at the boundaries of input ranges.
 */
public class L2021110871_2_Test {

    /**
     * Test the removeDuplicateLetters method with a basic input.
     * Testing purpose: Verify that the method removes duplicate letters and maintains the smallest lexicographical order.
     * Test case: Input string "bcabc".
     */
    @Test
    public void testRemoveDuplicateLettersBasic() {
        Solution2 solution = new Solution2();
        String input = "bcabc";
        String expected = "abc";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     * Test the removeDuplicateLetters method with a more complex input.
     * Testing purpose: Check the removal of duplicate letters and preservation of lexicographical order.
     * Test case: Input string "cbacdcbc".
     */
    @Test
    public void testRemoveDuplicateLettersComplex() {
        Solution2 solution = new Solution2();
        String input = "cbacdcbc";
        String expected = "acdb";
        String result = solution.removeDuplicateLetters(input);
        assertEquals(expected, result);
    }

    /**
     * Add more test methods based on different equivalence classes and boundary values.
     * Ensure to include comments explaining the purpose of each test and the chosen test cases.
     */

    // Example of a test method for a specific equivalence class or boundary value:
    // @Test
    // public void testRemoveDuplicateLettersBoundary() {
    //     Solution2 solution = new Solution2();
    //     String input = "xyz";
    //     String expected = "xyz";
    //     String result = solution.removeDuplicateLetters(input);
    //     assertEquals(expected, result);
    // }
}
