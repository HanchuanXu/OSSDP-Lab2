import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 测试用例设计的总体原则:等价类划分
 */
public class L2021110834_2_Test {
    @Test
    public void removeDuplicateLettersTest(){
        String a = "bcabc";
        String b = "cbacdcbc";
        String c = "dcba";
        Solution2 test = new Solution2();
        //测试去除重复字符
        assertEquals("abc",test.removeDuplicateLetters(a));
        //测试去除重复字符后按字母序列排
        assertEquals("acdb",test.removeDuplicateLetters(b));
        //测试不发生改变
        assertEquals("dcba",test.removeDuplicateLetters(c));
    }
}

