import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L2021112648_7_Test{
    public static void main(String[] args){
        /**
         * 等价类划分
         * 
         * 基本情况
         *  字符串长度为1 "a"
         * 
         * 有交换的情况
         *  无重叠的交换："dcab"，pairs = [[0,3],[1,2]]
         *  有重叠的交换："dcab"，pairs = [[0,3],[1,2],[0,2]]
         * 
         * 没有交换的情况
         *  字符串已经按字典序排列："abcd"
         * 
         * 多个连通分量的情况
         *  多个连通分量，需要交换："dcba"，pairs = [[0,3],[1,2],[0,2]]
         *  多个连通分量，不需要交换："abcd"，pairs = [[0,1],[1,2]]
         */
        // 一般情况
        test("Single Character", "a", new ArrayList<>());

        // 有交换的情况
        test("No Overlapping Swap", "bacd", Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2)));
        test("With Overlapping Swap", "abcd", Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2)));

        // 没有交换的情况
        test("Already Sorted String", "abcd", new ArrayList<>());

        // 多个连通分量的情况
        test("Multiple Components with Swap", "acbd", Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2)));
        test("Multiple Components without Swap", "abc", Arrays.asList(Arrays.asList(0, 1), Arrays.asList(1, 2)));
        
        // 更复杂的测试
        test("Complex Test Case", "dcba", Arrays.asList(Arrays.asList(0, 3), Arrays.asList(1, 2), Arrays.asList(0, 2)));
    }

    private static void test(String testName, String s, List<List<Integer>> pairs) {
        Solution7 solution = new Solution7();
        System.out.println("Test Case: " + testName);
        System.out.println("Input: s = " + s + ", pairs = " + pairs);
        System.out.println("Output: " + solution.smallestStringWithSwaps(s, pairs));
        System.out.println();
    }
}