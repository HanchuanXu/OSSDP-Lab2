
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L2021112678_Solution8_Test {

    /**
     * 测试策略
     * 1.  当grid为空null，empty，岛屿数为0
     * 2.  当grid只有一个元素。grip[0][0]为0，岛屿数为0，grip[0][0]为1,岛屿数为1
     * 3.  当grid只有一行或者一列
     * 3.1 当grip全为0，grip全为1
     * 3.2 grip的1和0不连续，交替出现
     * 3.3 grip的1和0都是连续出现的
     * 4.  grip大于一行一列的一般情况
     * 4.1 当grip全为0，全为1
     * 4.2 当grip元素0和1交替出现
     * 4.3 grip元素0和1交替、连续出现
     **/
    @Test
    public void numIslandsTest() {
        Solution8 solution = new Solution8();
        char[][] grip1 = null;
        char[][] grip2 = new char[0][0];
        char[][] grip3 = {{'0'}};
        char[][] grip4 = {{'1'}};
        char[][] grip5 = {{'1','1','1','1','1'}};
        char[][] grip6 = {{'0','0','0','0','0'}};
        char[][] grip7 = {{'1'},{'1'},{'1'},{'1'},{'1'}};
        char[][] grip8 = {{'0'},{'0'},{'0'},{'0'},{'0'}};
        char[][] grip9 = {{'1','1','1'},{'0','1','0'},{'1','1','1'}};
        char[][] grip10= {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        char[][] grip11= {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0','0','1','0','0'},{'0','0','0','1','1'}};
        char[][] grip12= {{'0','0','0'},{'0','1','0'},{'0','0','0'}};
        assertEquals(solution.numIslands(grip1),0);
        assertEquals(solution.numIslands(grip2),0);
        assertEquals(solution.numIslands(grip3),0);
        assertEquals(solution.numIslands(grip4),1);
        assertEquals(solution.numIslands(grip5),1);
        assertEquals(solution.numIslands(grip6),0);
        assertEquals(solution.numIslands(grip7),1);
        assertEquals(solution.numIslands(grip8),0);
        assertEquals(solution.numIslands(grip9),1);
        assertEquals(solution.numIslands(grip10),1);
        assertEquals(solution.numIslands(grip11),3);
        assertEquals(solution.numIslands(grip12),1);
    }

}
