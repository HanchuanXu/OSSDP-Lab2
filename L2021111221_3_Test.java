import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class L2021111221_3_Test {
    // Testing strategy
    //  根据等价类划分，需要考虑数组大小和最大整除子集大小
    //  按数组大小划分：
    //  单元素数组：只包含一个元素的情况。
    //  有多个元素的数组：包含多个元素的情况。
    //  按最大子集大小划分
    //  子集大小为1：数组中元素都不可整除
    //  子集大小介于1到数组大小之间：部分元素符合要求
    //  子集大小等于数组大小：整个数组就是整除子集


    @Test
    //测试单元素数组，此时最大子集大小只能为1，令nums为{5}，预计结果也为{5}
    public void testSingleElementArray() {
        int[] nums = {5};
        Solution3 solution = new Solution3();
        List<Integer> result = solution.largestDivisibleSubset(nums);
        assertArrayEquals(new int[]{5}, result.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    //测试多元素数组，最大子集大小为1的情况，令nums为{2，5，7，11，19}，预计结果为{2}
    public void testMultipleElementArraySingleAns() {
        int[] nums = {2, 5, 7, 11, 19};
        Solution3 solution = new Solution3();
        List<Integer> result = solution.largestDivisibleSubset(nums);
        assertArrayEquals(new int[]{2}, result.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    //测试多元素数组，最大子集大小介于1到数组大小之间的情况，令nums为{2，5，7，11，15}，预计结果为{5,15}
    public void testMultipleElementArrayMultAns() {
        int[] nums = {2, 5, 7, 11, 15};
        Solution3 solution = new Solution3();
        List<Integer> result = solution.largestDivisibleSubset(nums);
        assertArrayEquals(new int[]{5, 15}, result.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    //测试多元素数组，最大子集大小为1的情况，令nums为{2，4,8,16,32}，预计结果为{2,4,8,16,32}
    public void testMultipleElementArrayAllAns() {
        int[] nums = {2, 4, 8, 16, 32};
        Solution3 solution = new Solution3();
        List<Integer> result = solution.largestDivisibleSubset(nums);
        assertArrayEquals(new int[]{2, 4, 8, 16, 32}, result.stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    //测试数组元素数量庞大的情况
    public void testLargeElement() {
        int[] nums = {2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192};
        Solution3 solution = new Solution3();
        List<Integer> result = solution.largestDivisibleSubset(nums);
        assertArrayEquals(new int[]{2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192}, result.stream().mapToInt(Integer::intValue).toArray());
    }

}
