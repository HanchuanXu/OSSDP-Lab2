import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 等价类划分：
 * 输入数字数量: 0,1,多个
 * 是否含0：是、否
 *
 */
public class L2021112617_16_Test {
    //测试输入为空的情况
    @Test
    public void largestNumber0() {
        int[] nums = {};
        String result = new Solution().largestNumber(nums);
        assertEquals("", result);
    }
    //测试输入只含一个数字的情况
    @Test
    public void largestNumber1() {
        int[] nums = {123};
        String result = new Solution().largestNumber(nums);
        assertEquals("123", result);
    }
    //测试输入含多个数字的情况
    @Test
    public void largestNumber2() {
        int[] nums = {10, 2, 134, 700};
        String result = new Solution().largestNumber(nums);
        assertEquals("700213410", result);
    }
    //测试输入含0的情况
    @Test
    public void largestNumber3() {
        int[] nums = {0};
        String result = new Solution().largestNumber(nums);
        assertEquals("0", result);
    }
    //测试输入含多个0的情况
    @Test
    public void largestNumber4() {
        int[] nums = {1, 0, 0};
        String result = new Solution().largestNumber(nums);
        assertEquals("100", result);
    }
    //测试输入非常大，超过long的情况
    @Test
    public void largestNumber5() {
        int[] nums = {1234567890, 1324567890, 1243567890, 1235467890, 5, 6, 7, 8, 9};
        String result = new Solution().largestNumber(nums);
        assertEquals("987651324567890124356789012354678901234567890", result);
    }
}