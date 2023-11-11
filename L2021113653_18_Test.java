import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Test for L2021113653_18.Solution18
 * 等价类划分：
 * 输入数据的范围：全为正数、全为负数、有正有负、有0
 * 输入数据的长度：0、1、2、大于2
 */
public class L2021113653_18_Test {
    /**
     * 测试用例：长度大于2，全为正数
     * 测试目的：测试长度大于2，全为正数的情况
     */
    @Test
    public void testSolution1() {
        Solution18 solution18 = new Solution18();
        int[] nums = {1,2,3,4};
        int[] result = solution18.productExceptSelf(nums);
        int[] expected = {24,12,8,6};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    /**
     * 测试用例：长度大于2，全为负数
     * 测试目的：测试长度大于2，全为负数的情况
     */
    @Test
    public void testSolution2() {
        Solution18 solution18 = new Solution18();
        int[] nums = {-1,-1,-2,-3,-5};
        int[] result = solution18.productExceptSelf(nums);
        int[] expected = {30,30,15,10,6};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    /**
     * 测试用例：长度大于2，全为正数
     * 测试目的：测试长度大于2，全为正数的情况
     */
    @Test
    public void testSolution3() {
        Solution18 solution18 = new Solution18();
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int[] result = solution18.productExceptSelf(nums);
        int[] expected = {3628800,1814400,1209600,907200,725760,604800,518400,453600,403200,362880};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    /**
     * 测试用例：长度大于2，全0
     * 测试目的：测试长度大于2，全0的情况
     */
    @Test
    public void testSolution4() {
        Solution18 solution18 = new Solution18();
        int[] nums = {0,0,0,0,0,0,0,0,0,0};
        int[] result = solution18.productExceptSelf(nums);
        int[] expected = {0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    /**
     * 测试用例：长度为1
     * 测试目的：测试长度为1的情况
     */
    @Test
    public void testSolution5() {
        Solution18 solution18 = new Solution18();
        int[] nums = {1};
        int[] result = solution18.productExceptSelf(nums);
        int[] expected = {1};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    /**
     * 测试用例：长度为2
     * 测试目的：测试长度为2的情况
     */
    @Test
    public void testSolution6() {
        Solution18 solution18 = new Solution18();
        int[] nums = {1,2};
        int[] result = solution18.productExceptSelf(nums);
        int[] expected = {2,1};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    /**
     * 测试用例：长度大于2，有正有负
     * 测试目的：测试长度大于2，有正有负的情况
     */
    @Test
    public void testSolution7() {
        Solution18 solution18 = new Solution18();
        int[] nums = {1,2,-3};
        int[] result = solution18.productExceptSelf(nums);
        int[] expected = {-6,-3,2};
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }
}
