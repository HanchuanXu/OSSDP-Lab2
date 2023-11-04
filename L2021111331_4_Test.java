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

        // Test case 1: Standard test case
        int[] nums1 = {3, 6, 9, 1};
        int result1 = solution.maximumGap(nums1);
        assertEquals(3, result1); // Expected output: 3

        // Test case 2: Empty array, should return 0
        int[] nums2 = {};
        int result2 = solution.maximumGap(nums2);
        assertEquals(0, result2); // Expected output: 0

        // Test case 3: Array with a single element, should return 0
        int[] nums3 = {5};
        int result3 = solution.maximumGap(nums3);
        assertEquals(0, result3); // Expected output: 0

        // Test case 4: Array with two elements, should return the difference
        int[] nums4 = {7, 2};
        int result4 = solution.maximumGap(nums4);
        assertEquals(5, result4); // Expected output: 5

        // Add more test cases as needed
    }
}
