/**
 * description: add a description [描述信息]
 *
 * @author Ruan [作者]
 * @version 1.0.0 [版本信息]
 * @date 2023/11/04 09:33:04 [时间，这里是年/月/日 时:分:秒的格式]
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class L2021111331_4_Test {

    @Test
    public void testMaximumGap() {
        Solution4 solution = new Solution4();

        //以下是等价类划分的测试用例原则
        // 等价类1: 标准测试用例
        int[] nums1 = {3, 6, 9, 1};
        int result1 = solution.maximumGap(nums1);
        assertEquals(3, result1); // Expected output: 3

        // 等价类2: 空数组，应返回0
        int[] nums2 = {};
        int result2 = solution.maximumGap(nums2);
        assertEquals(0, result2); // Expected output: 0

        // 等价类3: 仅包含一个元素的数组，应返回0
        int[] nums3 = {5};
        int result3 = solution.maximumGap(nums3);
        assertEquals(0, result3); // Expected output: 0

        // 等价类4: 仅包含两个元素的数组，应返回两元素之间的差值
        int[] nums4 = {7, 2};
        int result4 = solution.maximumGap(nums4);
        assertEquals(5, result4); // Expected output: 5

        // Add more test cases as needed
    }
}
