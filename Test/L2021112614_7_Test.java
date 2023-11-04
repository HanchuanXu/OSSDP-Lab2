import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
/* *
 * 测试策略：
 * 测试方法smallestStringWithSwaps()
 *
 * 输入类型按以下方法划分：
 *      输入字符串是空字符串/输入字符串不是空字符串
 *      有可用交换/无可用交换
 *      结果不能是最小字典序/结果可以是最小字典序
 *      要得到结果，每种交换最多一次/至少一种交换使用多于一次
 * 每种取值至少覆盖一次
 */
public class L2021112614_7_Test {

    /**
     * 测试方法：smallestStringWithSwaps
     * 测试用例：
     *      1. “”，{{0，3},{1,2}} => “”
     *      2. "dcab",{}    => "dcab"
     *      3. "dcab",{{0,3},{1,2}}    => "bacd"
     *      4. "dcab",{{0,3},{1,2},{0,2}}   => "abcd"
     *      5. "cba", {{0,1},{1,2}} => "abc"
     */
    @Test
    public void smallestStringWithSwaps() {
        Solution7 s = new Solution7();

        String s0 = "";
        Integer[][] a0 = new Integer[][]{{0,3},{1,2}};
        List<List<Integer>> l0 = arrayToList(a0);
        assertEquals("源字符串为空字符串时","",s.smallestStringWithSwaps(s0,l0));

        String s1 = "dcab";
        List<List<Integer>> l1 = new ArrayList<>();
        assertEquals("无可用交换时","dcab",s.smallestStringWithSwaps(s1,l1));

        String s2 = "dcab";
        Integer[][] a2 = new Integer[][]{{0,3},{1,2}};
        List<List<Integer>> l2 = arrayToList(a2);
        assertEquals("有可用交换，源字符串为空字符串，结果不能是最小字典序，每种交换最多一次","bacd",s.smallestStringWithSwaps(s2,l2));

        String s3 = "dcab";
        Integer[][] a3 = new Integer[][]{{0,3},{1,2},{0,2}};
        List<List<Integer>> l3 = arrayToList(a3);
        assertEquals("有可用交换，源字符串为空字符串，可以是最小字典序，每种交换最多一次","abcd",s.smallestStringWithSwaps(s3,l3));

        String s4 = "cba";
        Integer[][] a4 = new Integer[][]{{0,1},{1,2}};
        List<List<Integer>> l4 = arrayToList(a4);
        assertEquals("至少一种交换使用多于一次","abc",s.smallestStringWithSwaps(s4,l4));
    }

    private List<List<Integer>> arrayToList(Integer[][] arr)
    {
        List<List<Integer>> output = new ArrayList<>();
        for(int i = 0;i<arr.length;i++)
        {
            output.add(Arrays.stream(arr[i]).toList());
        }
        return output;
    }

}