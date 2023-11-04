package test;

import org.junit.jupiter.api.Test;
import src.Solution11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;

public class L2021110577_11_Test {
    @Test
    public void testThreeSum() {
        Solution11 solution = new Solution11();

        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = solution.threeSum(nums1);
        assertEquals(2, result1.size());

        int[] nums2 = {0, 1, 1};
        List<List<Integer>> result2 = solution.threeSum(nums2);
        assertEquals(0, result2.size());

        int[] nums3 = {0, 0, 0};
        List<List<Integer>> result3 = solution.threeSum(nums3);
        assertEquals(1, result3.size());
    }
}
