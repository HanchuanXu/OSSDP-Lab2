import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * <h3>OSSDP-Lab2</h3>
 * <p>solution2测试类</p>
 *
 * @author : xjy
 * @date : 2023-11-11 10:07
 **/
public class L202111099_2_TEST {

    /**
     * 等价类划分原则
     *  等价类划分：
     *    1. 输入字符串为空
     *    2. 输入字符串中有重复字符
     *    3. 输入字符串中没有重复字符
     *
     *  测试目的：
     *    测试是否能够正确处理等价类中的每一个元素
     *
     *  测试用例：
     *    1. ""
     *    2. "bcabc"
     *    3. "cbacdcbc"
     *    4. "abcd"
     *
     */
    @Test
    public void test() {
        Solution2 solution2 = new Solution2();
        assertEquals(solution2.removeDuplicateLetters(""), "");
        assertEquals(solution2.removeDuplicateLetters("bcabc"), "abc");
        assertEquals(solution2.removeDuplicateLetters("cbacdcbc"), "acdb");
        assertEquals(solution2.removeDuplicateLetters("abcd"), "abcd");
    }
}
