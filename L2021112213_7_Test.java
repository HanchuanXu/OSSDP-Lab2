import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L2021112213_7_Test {

    //测试用例的基本原则；基于需求、场景化、描述精准、可判定、原子化、可回归、独立、正交
    //测试目的：测试算法能否正确运行
    /*
        Test case 1
        输入：s = "dcab", pairs = [[0,3],[1,2]]
        输出："bacd"
        */
    /*
        Test case 2
        输入：s = "dcab", pairs = [[0,3],[1,2],[0,2]]
        输出："abcd"
        */
    @Test
    public void testSmallestStringWithSwaps() {
        Solution7 yourClass = new Solution7();

        /*
        Test case 1
        输入：s = "dcab", pairs = [[0,3],[1,2]]
        输出："bacd"
        */
        String s1 = "dcab";
        List<List<Integer>> pairs1 = new ArrayList<>();
        pairs1.add(Arrays.asList(0, 3));
        pairs1.add(Arrays.asList(1, 2));
        String result1 = yourClass.smallestStringWithSwaps(s1, pairs1);
        assertEquals("b a c d ", result1);

        /*
        Test case 2
        输入：s = "dcab", pairs = [[0,3],[1,2],[0,2]]
        输出："abcd"
        */
        String s2 = "dcab";
        List<List<Integer>> pairs2 = new ArrayList<>();
        pairs2.add(Arrays.asList(0, 3));
        pairs2.add(Arrays.asList(1, 2));
        pairs2.add(Arrays.asList(0, 2));
        String result2 = yourClass.smallestStringWithSwaps(s2, pairs2);
        assertEquals("a b c d ", result2);


    }
}
