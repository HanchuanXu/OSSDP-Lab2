import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class L2021111824_5_Test {
    // 总体测试用例设计原则：等价类划分

    @Test
    public void testNumSubseq1() {
        // 测试目的：验证 numSubseq 方法的行为是否正确
        // 测试用例1：给定示例 [3, 5, 6, 7], target = 9
        int[] nums = {3, 5, 6, 7};
        int target = 9;
        int expected = 4; // 期望的结果
        int result = new Solution5().numSubseq(nums, target);
        assertEquals(expected, result); // 断言：期望的结果与实际结果相符
    }

    @Test
    public void testNumSubseq2() {
        // 测试目的：验证 numSubseq 方法的行为是否正确
        // 测试用例2：给定示例 [3, 3, 6, 8], target = 10
        int[] nums = {3, 3, 6, 8};
        int target = 10;
        int expected = 6; // 期望的结果
        int result = new Solution5().numSubseq(nums, target);
        assertEquals(expected, result); // 断言：期望的结果与实际结果相符
    }

    @Test
    public void testNumSubseq3() {
        // 测试目的：验证 numSubseq 方法的行为是否正确
        // 测试用例3：给定示例 [2, 3, 3, 4, 6, 7], target = 12
        int[] nums = {2, 3, 3, 4, 6, 7};
        int target = 12;
        int expected = 61; // 期望的结果
        int result = new Solution5().numSubseq(nums, target);
        assertEquals(expected, result); // 断言：期望的结果与实际结果相符
    }

}
