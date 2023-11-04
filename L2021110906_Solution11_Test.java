import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class L2021110906_Solution11_Test {

    /**
     * 测试用例设计的总体原则：
     *
     * 1. 等价类划分：将输入数据划分为多个等价类，并针对每个等价类设计一个测试用例。
     * 2. 边界值分析：针对输入数据的边界值设计测试用例，以确保代码在边界情况下的正确性。
     * 3. 特殊值分析：针对输入数据的特殊值设计测试用例，以确保代码在特殊情况下的正确性。
     */

    @Test
    void testEmptyArray() {
        // 测试输入数组为空的情况
        int[] nums = {};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> actual = Solution11.threeSum(nums);

        // 断言
        assertEquals(expected, actual);
    }

    @Test
    void testAllNegativeNumbers() {
        // 测试输入数组所有元素均为负数的情况
        int[] nums = {-1, -2, -3};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -2, -3));
        List<List<Integer>> actual = Solution11.threeSum(nums);

        // 断言
        assertEquals(expected, actual);
    }

    @Test
    void testAllPositiveNumbers() {
        // 测试输入数组所有元素均为正数的情况
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2, 0));
        List<List<Integer>> actual = Solution11.threeSum(nums);

        // 断言
        assertEquals(expected, actual);
    }

    @Test
    public void testDuplicateNumbers() {
        // 测试输入数组中存在重复数字的情况
        int[] nums = {-1, -1, 0, 1, 2};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 0));
        List<List<Integer>> actual = Solution11.threeSum(nums);

        // 断言
        assertEquals(expected, actual);
    }

    @Test
    public void testNoSolution() {
        // 测试输入数组中没有满足条件的三元组的情况
        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> actual = Solution11.threeSum(nums);

        // 断言
        assertEquals(expected, actual);
    }
}