package org.example;

import org.junit.Assert;
import org.junit.Test;
public class L2021113702_solution9_Test {

    // 等价类划分原则：
    // 1.人的总数 n：n < 1, n = 1, n > 1
    // 2.dislikes 数组：空数组，包含不喜欢关系的数组
    @Test
    public void testPossibleBipartition() {
        Solution9 solution = new Solution9();

        // 空数组，无不喜欢关系
        int[][] dislikes1 = {};
        Assert.assertTrue(solution.possibleBipartition(1, dislikes1));

        // 两个人，无不喜欢关系
        int[][] dislikes2 = {};
        Assert.assertTrue(solution.possibleBipartition(2, dislikes2));

        // 两个人，有不喜欢关系
        int[][] dislikes3 = {{1, 2}};
        Assert.assertTrue(solution.possibleBipartition(2, dislikes3));

        // 三个人，有不喜欢关系
        int[][] dislikes4 = {{1, 2}, {2, 3}, {3, 1}};
        Assert.assertFalse(solution.possibleBipartition(3, dislikes4));

        // 三个人，无不喜欢关系
        int[][] dislikes5 = {};
        Assert.assertTrue(solution.possibleBipartition(3, dislikes5));

        // 三个人，部分不喜欢关系
        int[][] dislikes6 = {{1, 2}, {2, 3}};
        Assert.assertTrue(solution.possibleBipartition(3, dislikes6));
    }
}