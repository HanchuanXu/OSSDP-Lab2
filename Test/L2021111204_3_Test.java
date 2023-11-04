import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.Assert.*;

public class L2021111204_3_Test {

    //   TODO Solution3测试
    //     等价类划分：
    //     1.nums的最大整除子集是它本身
    //     2.nums的最大整除子集不是它本身
    //     设计测试用例：
    //     1.nums = {1,2,3}
    //     2.nums = {1,2,4,8}
    //     测试目的：
    //     测试Solution3内的LargestDivisibleSubset方法能否输出期望结果
    @Test
    public void testLargestDivisibleSubset() {
            Solution3 s3 = new Solution3();
            int[] nums1 = {1,2,3};
            int[] nums2 = {1,2,4,8};
            List<Integer> ans1 = new ArrayList<>(Arrays.asList(new Integer[]{1,2}));
            List<Integer> ans2 = new ArrayList<>(Arrays.asList(new Integer[]{1,2,4,8}));
            List<Integer> res1 = s3.largestDivisibleSubset(nums1);
            List<Integer> res2 = s3.largestDivisibleSubset(nums2);
            assert ans1.containsAll(res1)&&res1.containsAll(ans1);
            assert ans2.containsAll(res2)&&res2.containsAll(ans2);

    }
}