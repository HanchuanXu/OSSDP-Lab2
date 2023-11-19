import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
public class SolutionTest {
/*
测试设计原则：等价类划分原则（Equivalence Partitioning）
将输入数据分成不同的等价类，确保从每个等价类中选择一个典型的代表进行测试。
 */


    /*
findMinHeightTrees()
测试目的： 确保 findMinHeightTrees() 方法能够正确找到最小高度树的根节点。
测试用例：
正常情况1： n = 4，边缘情况下的边的连接关系 {{1, 0}, {1, 2}, {1, 3}}，预期返回根节点为 1。
正常情况2： n = 6，边缘情况下的边的连接关系 {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}}，预期返回根节点为 3 和 4。
只有一个节点： n = 1，没有边连接，预期返回根节点为 0。
多个节点但只有一条边： n = 3，只有一条边连接 {{0, 1}}，预期返回根节点为 0 和 1。
 */
    @Test
    public void findMinHeightTrees() {
        Solution solution = new Solution();

        // 正常情况1
        int n1 = 4;
        int[][] edges1 = {{1, 0}, {1, 2}, {1, 3}};
        List<Integer> result1 = solution.findMinHeightTrees(n1, edges1);
        assertArrayEquals(new Integer[]{1}, result1.toArray());

        // 正常情况2
        int n2 = 6;
        int[][] edges2 = {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        List<Integer> result2 = solution.findMinHeightTrees(n2, edges2);
        assertArrayEquals(new Integer[]{3, 4}, result2.toArray());

        // 边缘情况：只有一个节点
        int n3 = 1;
        int[][] edges3 = {};
        List<Integer> result3 = solution.findMinHeightTrees(n3, edges3);
        assertArrayEquals(new Integer[]{0}, result3.toArray());

        // 边缘情况：多个节点但是只有一条边
        int n4 = 3;
        int[][] edges4 = {{0, 1}};
        List<Integer> result4 = solution.findMinHeightTrees(n4, edges4);
        assertArrayEquals(new Integer[]{0, 1}, result4.toArray());
    }


    /*
findLongestNode()
测试目的： 确保 findLongestNode() 方法能够正确找到最长节点。
测试用例：
 创建一个示例的节点和连接关系，预期返回根节点为 0。
 */

    @Test
    public void findLongestNode() {
        Solution solution = new Solution();

        // 编写测试用例
        // ...

        // 示例测试用例
        int[] parent = new int[4];
        List<Integer>[] adj = new List[4];
        for (int i = 0; i < 4; i++) {
            adj[i] = Arrays.asList();
        }
        int longestNode = solution.findLongestNode(0, parent, adj);
        assertEquals(0, longestNode);
    }
}