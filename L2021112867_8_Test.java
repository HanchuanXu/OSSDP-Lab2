import org.junit.Assert;
import org.junit.Test;
/**
 * 功能:
 * 作者: 浅雨梦梨
 * 日期: 2023/11/9 16:40
 */


public class L2021112867_8_Test {
    private final Solution8 sol = new Solution8();

    /**
     * 测试不期望的输入
     */
    @Test
    public void inputTest(){
        //空输入
        char[][] grid1 = {};
        Assert.assertEquals(0, sol.numIslands(grid1));

        //非法输入
        char[][] grid2 = {{'1','2','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}};
        Assert.assertEquals(0, sol.numIslands(grid2));
    }

    /**
     * 测试某一边边长为1的情况
     */
    @Test
    public void testSideLenEq1(){
        //岛屿数量为0
        char[][] grid1 = {{'0'},
                {'0'},
                {'0'},
                {'0'}};
        Assert.assertEquals(0, sol.numIslands(grid1));
        char[][] grid2 = {{'0','0','0','0'}};
        Assert.assertEquals(0, sol.numIslands(grid2));

        //岛屿数量为1
        char[][] grid3 = {{'1'},
                {'1'},
                {'0'},
                {'0'}};
        Assert.assertEquals(1, sol.numIslands(grid3));
        char[][] grid4 = {{'0','1','0','0'}};
        Assert.assertEquals(1, sol.numIslands(grid4));

        //岛屿数量大于1
        char[][] grid5 = {{'0'},
                {'1'},
                {'0'},
                {'1'}};
        Assert.assertEquals(2, sol.numIslands(grid5));
        char[][] grid6 = {{'1','0','1','0'}};
        Assert.assertEquals(2, sol.numIslands(grid6));
    }

    /**
     * 测试边长大于1的情况,按照岛屿数量划分
     */
    @Test
    public void testSideLenOver1(){
        //岛屿数量为0
        char[][] grid1 = {{'0','0','0','0','0'},
                {'0','0','0','0','0'},
                {'0','0','0','0','0'},
                {'0','0','0','0','0'}};
        Assert.assertEquals(0, sol.numIslands(grid1));

        //岛屿数量为1且为非聚合的
        char[][] grid2 = {{'0','0','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','0','0'},
                {'0','0','0','0','0'}};
        Assert.assertEquals(1, sol.numIslands(grid2));

        //岛屿数量为1且为多个小岛聚合的
        char[][] grid3 = {{'0','0','0','0','0'},
                {'0','1','1','0','0'},
                {'0','0','1','1','0'},
                {'0','0','1','0','0'}};
        Assert.assertEquals(1, sol.numIslands(grid3));

        //岛屿数量为2
        char[][] grid4 = {{'1','0','0','0','0'},
                {'1','0','1','0','0'},
                {'0','0','1','1','0'},
                {'0','0','1','0','0'}};
        Assert.assertEquals(2, sol.numIslands(grid4));

        //岛屿数量为3
        char[][] grid5 = {{'1','0','0','0','1'},
                {'1','0','1','0','1'},
                {'0','0','1','1','0'},
                {'0','0','1','0','0'}};
        Assert.assertEquals(3, sol.numIslands(grid5));
    }


}
