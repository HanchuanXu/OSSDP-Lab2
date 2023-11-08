import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L2021111558_5_Test {
    // 总体测试用例设计原则：等价类划分

    @Test
    public void testNumSubseq1() {
        // 测试目的： 检验算法准确性
        // 测试用例1：给定示例 [3, 5, 6, 7], target = 9
        int[] nums = {3, 5, 6, 7};
        int target = 9;
        int expected = 4;
        int result = new Solution5().numSubseq(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testNumSubseq2() {
        // 测试目的：检验算法准确性
        // 测试用例2：给定示例 [3, 3, 6, 8], target = 10
        int[] nums = {3, 3, 6, 8};
        int target = 10;
        int expected = 6;
        int result = new Solution5().numSubseq(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testNumSubseq3() {
        // 测试目的：检验算法准确性
        // 测试用例3：给定示例 [2, 3, 3, 4, 6, 7], target = 12
        int[] nums = {2, 3, 3, 4, 6, 7};
        int target = 12;
        int expected = 61;
        int result = new Solution5().numSubseq(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testDuplicateNumbers() {
        // 测试目的：检验算法对于重复数字的数组准确性
        // 测试用例4：给定示例 [1，1，1，1], target = 2
        int[] nums = {1, 1, 1, 1};
        int target = 2;
        int expected = 15;
        int result = new Solution5().numSubseq(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyArray() {
        // 测试目的：检验算法对于空数组的准确性
        // 测试用例5：给定示例 [], target = 2
        int[] nums = {};
        int target = 5;
        int expected = 0;
        int result = new Solution5().numSubseq(nums, target);
        assertEquals(expected, result);
    }
}
