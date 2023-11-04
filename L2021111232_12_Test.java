import org.junit.Test;

import static org.junit.Assert.*;


/**
 * 对Solution类中的 multiply(); 和 addString(); 两个函数进行测试
 */
public class L2021111232_12_Test {

    private Solution solution = new Solution();

    /**
     * 对multiply();进行测试
     * 输入变量一个或两个为零
     * 测试输入：("0", "8"), ("8", "0"), ("0", "0")
     *
     * 对输入变量的位数关于十位数及以上的个数以及计算时是否出现进位进行划分
     * 测试输入：("2", "2"), ("4", "133"), ("123", "123")
     */
    @Test
    public void testMultiply() {
        assertEquals("0", solution.multiply("0", "8"));
        assertEquals("0", solution.multiply("8", "0"));
        assertEquals("0", solution.multiply("0", "0"));
        assertEquals("4", solution.multiply("2", "2"));
        assertEquals("532", solution.multiply("4", "133"));
        assertEquals("15129", solution.multiply("123", "123"));
    }

    /**
     * 对addString();进行测试
     * 输入变量一个或两个为零
     * 测试输入：("0", "8"), ("8", "0"), ("0", "0")
     *
     * 对输入变量的位数关于十位数及以上的个数以及计算时是否出现进位进行划分
     * 测试输入：("2", "2"), ("666", "444")
     */
    @Test
    public void testAddString() {
        assertEquals("8", solution.addStrings("0", "8"));
        assertEquals("8", solution.addStrings("8", "0"));
        assertEquals("0", solution.addStrings("0", "0"));
        assertEquals("4", solution.addStrings("2", "2"));
        assertEquals("1110", solution.addStrings("666", "444"));
    }
}