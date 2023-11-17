import org.junit.Test;
import src.Solution7;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;



/**
     * src.Solution7 Tester.
     *
     * @author <Authors name>
     * @since <pre>11, 4, 2023</pre>
     * @version 1.0
     */
public class L2021112324_7_Test {

    /**
     *
     * 方法: smallestStringWithSwaps(String s, List<List<Integer>> pairs)
     * 等价类划分
     * 若字符长度为1，则返回原字符；
     * 若字符长度不为1，则
     *      若索引对长度为0，则返回原字符；
     *      若索引对长度不为0，则返回交换后的字符。
     *
     */
    @Test
    public void testSmallestStringWithSwaps() throws Exception {
        Solution7 testSolution7 = new Solution7();

        String test1_s = "a";
        List<List<Integer>> test1_p = new ArrayList<>();
        List<Integer> test1_p_1 = new ArrayList<>();
        test1_p_1.add(1);test1_p_1.add(1);                                      // [1,1]
        test1_p.add(test1_p_1);                                                 // [[1,1]]
        assertEquals("a",testSolution7.smallestStringWithSwaps(test1_s,test1_p));

        String test2_s = "abcd";
        List<List<Integer>> test2_p = new ArrayList<>();
        List<Integer> test2_p_1 = new ArrayList<>();
        assertEquals("abcd",testSolution7.smallestStringWithSwaps(test2_s,test2_p));

        String test3_s = "dcab";
        List<List<Integer>> test3_p = new ArrayList<>();
        List<Integer> test3_p_1 = new ArrayList<>();
        test3_p_1.add(0);test3_p_1.add(3);                                      // [0,3]
        List<Integer> test3_p_2 = new ArrayList<>();
        test3_p_2.add(1);test3_p_2.add(2);                                      // [1,2]
        List<Integer> test3_p_3 = new ArrayList<>();
        test3_p_3.add(0);test3_p_3.add(2);                                      // [0,2]
        test3_p.add(test3_p_1);test3_p.add(test3_p_2);test3_p.add(test3_p_3);   // [[0,3],[1,2],[0,2]]
        assertEquals("abcd",testSolution7.smallestStringWithSwaps(test3_s,test3_p));
    }
} 
