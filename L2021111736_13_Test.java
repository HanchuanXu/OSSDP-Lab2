import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class L2021111736_13_Test {
    /**
     *  The answer needs to be sorted
     */
    @Test
    public void testSolution1() {
        Solution solution = new Solution();
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        int[] ans = { 0, 0, 1, 1, 2, 2 };
        solution.sortColors(nums);
        assertEquals(Arrays.toString(ans), Arrays.toString(nums));
    }
    /**
     *  The answer doesn't need to be sorted
     */
    @Test
    public void testSolution2() {
        Solution solution = new Solution();
        int[] nums = { 0, 0, 1, 1, 2, 2 };
        int[] ans = { 0, 0, 1, 1, 2, 2 };
        solution.sortColors(nums);
        assertEquals(Arrays.toString(ans), Arrays.toString(nums));
    }
    /**
     *  The data does not include all.
     */
    @Test
    public void testSolution3() {
        Solution solution = new Solution();
        int[] nums = { 2, 1, 2, 1, 1, 2 };
        int[] ans = { 1, 1, 1, 2, 2, 2 };
        solution.sortColors(nums);
        assertEquals(Arrays.toString(ans), Arrays.toString(nums));
    }
}
