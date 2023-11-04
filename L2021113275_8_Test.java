import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class L2021113275_8_Test
{
    Solution8 program = new Solution8();
    /*
     * Testing strategy
     * 根据是否为空输入来划分
     */
    @Test
    public void isEmptyGrid()
    {
        // 测试用例1：空输入
        // 测试用例2：正常输入
        char[][] grid1 = {};
        char[][] grid2 = {
                {'1', '1', '0', '0'},
                {'1', '1', '0', '0'},
                {'0', '0', '1', '0'},
                {'0', '0', '0', '1'}};
        assertEquals(0, program.numIslands(grid1));
        assertEquals(3, program.numIslands(grid2));
    }


    /*
     * Testing strategy
     * 根据是否有不合法的数字来划分
     */
    @Test
    public void isHaveInvalidNumber()
    {
        // 测试用例1：有无效的数字2
        // 测试用例2：正常输入
        char[][] grid1 = {
                {'2', '1', '0', '0'},
                {'1', '1', '0', '0'},
                {'0', '0', '1', '0'},
                {'0', '0', '0', '1'}
        };
        char[][] grid2 = {
                {'0', '1', '0', '0'},
                {'1', '1', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '1'}};
        assertEquals(0, program.numIslands(grid1));
        assertEquals(2, program.numIslands(grid2));
    }


    /*
     * Testing strategy
     * 根据0个  1个  多个岛屿划分
     */
    @Test
    public void numberOfIsland()
    {
        //0个岛屿
        char[][] grid1 = {
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'},
                {'0', '0', '0', '0'}
        };
        //1个岛屿
        char[][] grid2 = {
                {'0', '1', '0', '0'},
                {'1', '1', '1', '0'},
                {'0', '0', '1', '0'},
                {'0', '0', '0', '0'}};
        //多个岛屿
        char[][] grid3 = {
                {'0', '1', '0', '0'},
                {'1', '1', '0', '0'},
                {'0', '0', '1', '0'},
                {'0', '1', '0', '1'}};
        assertEquals(0, program.numIslands(grid1));
        assertEquals(1, program.numIslands(grid2));
        assertEquals(4, program.numIslands(grid3));
    }

    /*
     * Testing strategy
     * 根据二维数组行数和列数划分
     */
    @Test
    public void numberOfRows()
    {
        //一行一列
        char[][] grid1 = {
                {'0'}
        };

        //一行多列
        char[][] grid2 = {
                {'0', '1', '0', '0'}};

        //多行一列
        char[][] grid3 = {
                {'0'},
                {'1'},
                {'0'},
                {'1'}};

        //多行多列
        char[][] grid4 = {
                {'0', '1', '0', '0'},
                {'1', '0', '1', '0'},
                {'0', '1', '1', '0'},
                {'0', '0', '0', '0'}};
        assertEquals(0, program.numIslands(grid1));
        assertEquals(1, program.numIslands(grid2));
        assertEquals(2, program.numIslands(grid3));
        assertEquals(3, program.numIslands(grid4));
    }

}
