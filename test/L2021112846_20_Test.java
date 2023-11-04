package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 测试类总体原则：等价划分原则
 */
class L2021112846_20_Test {

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach，测试开始");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEach，测试结束");
    }

    @Test
    void findMinHeightTrees() {
        Solution20 s = new Solution20();

        // 等价类1: 生成最小高度树只有一个可能的节点
        // 输入：n = 4, edges = [[1,0],[1,2],[1,3]]
        // 输出：[1]
        int[][] edges1 = {{1, 0}, {1, 2}, {1, 3}};
        assertEquals(new ArrayList<>(List.of(1)) , s.findMinHeightTrees(4, edges1));

        // 等价类2: 生成最小高度树有多个可能的节点
        // 输入：n = 6, edges = [[3,0],[3,1],[3,2],[3,4],[5,4]]
        // 输出：[3,4]
        int[][] edges2 = {{3, 0}, {3, 1}, {3, 2}, {3, 4}, {5, 4}};
        assertEquals(new ArrayList<>(List.of(3, 4)) , s.findMinHeightTrees(6, edges2));

        // 等价类3: 输入的边为空
        // 输入：n = 0, edges = []
        // 输出：ArrayIndexOutOfBoundsException异常
        int[][] edges3 = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> s.findMinHeightTrees(0, edges3));

        // 等价类4: 输入的边不为空，但是节点数为0
        // 输入：n = 0, edges = [[1,0],[1,2],[1,3]]
        // 输出：ArrayIndexOutOfBoundsException异常
        int[][] edges4 = {{1, 0}, {1, 2}, {1, 3}};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> s.findMinHeightTrees(0, edges4));

    }
}