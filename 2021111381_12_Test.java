import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * 这个测试类遵循等价类划分原则。
 * 输入空间被划分为几个'等价'的类，程序在这些类中应该有相似的行为。
 * 然后从每个类中选择测试用例。
 */
public class L2021111381_12_Test {
    Solution solution = new Solution();

    /**
     * 测试multiply方法，输入中一个或两个数字为零的情况。
     * 测试用例：("0", "123"), ("456", "0"), ("0", "0")
     */
    @Test
    public void testMultiplyWithZero() {
        assertEquals("0", solution.multiply("0", "123"));
        assertEquals("0", solution.multiply("456", "0"));
        assertEquals("0", solution.multiply("0", "0"));
    }

    /**
     * 测试multiply方法，输入中两个数字都不为零的情况。
     * 测试用例：("123", "456"), ("999", "999"), ("1000", "1000")
     */
    @Test
    public void testMultiplyWithNonZeroNumbers() {
        assertEquals("56088", solution.multiply("123", "456"));
        assertEquals("998001", solution.multiply("999", "999"));
        assertEquals("1000000", solution.multiply("1000", "1000"));
    }
}