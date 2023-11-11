import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class L2021111868_13_Test {
    /**
     * 测试策略：
     * 这个测试集用于测试 Solution13 类中的 sortColors 方法。
     * 使用不同的输入数组来验证排序结果是否符合预期。
     * 涵盖了不同的等价类，包括具有相同元素、不同元素和乱序元素的情况。
     * 每个测试方法都测试了不同的输入情况和期望的排序结果。
     */

    @Test
    public void testSolution_1() {
        // 测试方法的目的：
        // 验证 sortColors 方法能够正确地将输入数组 [2, 2, 1, 1, 0, 0] 排序为 [0, 0, 1, 1, 2, 2]。
        // 确保方法能够正确处理具有相同元素的输入情况。

        int[] nums = {2, 2, 1, 1, 0, 0};
        Solution13 test = new Solution13();
        test.sortColors(nums);
        int[] num_valid = {0, 0, 1, 1, 2, 2};
        assertArrayEquals(num_valid, nums);
    }

    @Test
    public void testSolution_2() {
        // 测试方法的目的：
        // 验证 sortColors 方法能够正确地将输入数组 [1, 2, 1, 2] 排序为 [1, 1, 2, 2]。
        // 确保方法能够正确处理具有不同元素的输入情况。

        int[] nums = {1, 2, 1, 2};
        Solution13 test = new Solution13();
        test.sortColors(nums);
        int[] num_valid = {1, 1, 2, 2};
        assertArrayEquals(num_valid, nums);
    }

    @Test
    public void testSolution_3() {
        // 测试方法的目的：
        // 验证 sortColors 方法能够正确地将输入数组 [1, 2, 1, 2, 0] 排序为 [0, 1, 1, 2, 2]。
        // 确保方法能够正确处理乱序元素的输入情况。

        int[] nums = {1, 2, 1, 2, 0};
        Solution13 test = new Solution13();
        test.sortColors(nums);
        int[] num_valid = {0, 1, 1, 2, 2};
        assertArrayEquals(num_valid, nums);
    }
}