package test;
import org.junit.Assert;
import org.junit.Test;
/**
 * 测试用例设计的总体原则：
 * 1.等价类划分：基于输入规范，将输入的数据划分为不同的等价类，使得属于同一等价类的数据能够被相同的处理。
 * 2.边界值分析：测试等价类的边界值，因为边界处错误概率更改。
 */
public class L2021111406_4_Test{

    Solution4 solution = new Solution4();

    /**
     * 等价类：
     * - 只有一个元素的数组
     * - 只有两个元素的数组
     * - 元素值全部相同的数组
     * - 元素值完全不同的数组
     * 
     * 边界值：
     * - 数组的长度是最小的
     * - 数组的长度是最大的
     * - 元素的值是最小的
     * - 元素的值是最大的
     */

    @Test
    public void testMaximumGap() {
        // 测试只有一个元素的数组
        int[] nums1 = {5};
        Assert.assertEquals(0, solution.maximumGap(nums1));

        // 测试只有两个元素的数组
        int[] nums2 = {5, 10};
        Assert.assertEquals(5, solution.maximumGap(nums2));

        // 测试元素值全部相同的数组
        int[] nums3 = {7, 7, 7, 7};
        Assert.assertEquals(0, solution.maximumGap(nums3));

        // 测试元素值完全不同的数组
        int[] nums4 = {3, 6, 9, 1};
        Assert.assertEquals(3, solution.maximumGap(nums4));

        int[] nums6 = {10, 20, 30, 40};
        Assert.assertEquals(10, solution.maximumGap(nums6));

        int[] nums7 = {1, 2, 3, 5, 8};
        Assert.assertEquals(3, solution.maximumGap(nums7));

        int[] nums8 = {1};
        Assert.assertEquals(0, solution.maximumGap(nums8));

        int[] nums9 = {100, 300, 500, 700, 900};
        Assert.assertEquals(200, solution.maximumGap(nums9));

        int[] nums10 = {100, 101, 102, 103, 200};
        Assert.assertEquals(97, solution.maximumGap(nums10));

    }
}
