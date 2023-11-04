import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class L2021110959_2_Test {
    //测试方法：等价类划分
    //等价类：没有重复字母 有重复字母
    //      原字符串按字典序排列 原字符串不按照字典序排列
    //测试目的：测试函数功能：去除字符串中重复的字母，使得每个字母只出现一次。需保证返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
    //测试用例：没有重复字母+按字典序排列：abc 没有重复字母+不按字典序排列：cdba
    //        有重复字母+按字典序排列：aaabcddd 有重复字母+不按字典序排序：ccccbbaass
    @Test
    public void testSolution2(){
        Solution2 f = new Solution2();
        assertEquals("abc",f.removeDuplicateLetters("abc"));
        assertEquals("cdba",f.removeDuplicateLetters("cdba"));
        assertEquals("abcd",f.removeDuplicateLetters("aaabcddd"));
        assertEquals("cbas",f.removeDuplicateLetters("ccccbbaass"));

    }
}
