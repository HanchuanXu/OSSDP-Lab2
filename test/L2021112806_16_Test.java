import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/*
 * Testing LargestNumber(nums)
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 按照等价类划分的原则：
 *  空的数据，非空的数据
 *  只含0的数据，含0的数据，不含0的数据
 *  普通数据，全为个位数，全为两位数
 */
public class L2021112806_16_Test {
    // Testing strategy for Solution16.largestNumber(nums)
    //   按数组里的数据进行等价类划分
    //   测试用例：
    //        空数据 numsERROR = {};
    //        只含0的数据 num0 = {0};
    //        普通数据 nums1 = {4, 10, 6};
    //        全为个位数数据 nums2 = {9,2};
    //        全为两位数数据 nums3 = {64,30,34,58,91};
    //        含0数据 nums4 = {0,30,34,5,9};

    @Test
    public void testLargestNumber() {
        Solution16 solution16 = new Solution16();

        int[] nums0 = {0};
        int[] nums1 = {4, 10, 6};
        int[] nums2 = {9,2};
        int[] nums3 = {64,30,34,58,91};
        int[] nums4 = {0,30,34,5,9};
        int[] numsERROR = {};
        String ERROR;
        String maxNum0;
        String maxNum1;
        String maxNum2;
        String maxNum3;
        String maxNum4;

        ERROR = solution16.largestNumber(numsERROR);
        assertEquals("数组为空！", ERROR);

        maxNum0 = solution16.largestNumber(nums0);
        maxNum1 = solution16.largestNumber(nums1);
        maxNum2 = solution16.largestNumber(nums2);
        maxNum3 = solution16.largestNumber(nums3);
        maxNum4 = solution16.largestNumber(nums4);

        assertEquals("0", maxNum0);
        assertEquals("6410", maxNum1);
        assertEquals("92", maxNum2);
        assertEquals("9164583430", maxNum3);
        assertEquals("9534300", maxNum4);
    }
}
