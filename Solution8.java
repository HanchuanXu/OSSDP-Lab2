/**
 * @description:
 *
 * 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
 *
 * 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
 *
 * 此外，你可以假设该网格的四条边均被水包围。
 *
 *
 *
 * 示例 1：
 *
 * 输入：grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * 输出：1
 * 示例 2：
 *
 * 输入：grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * 输出：3
 *
 *
 * 提示：
 *
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 300
 * grid[i][j] 的值为 '0' 或 '1'
 *
 */
class Solution8 {
    void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;
        //bug-3
        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }
        //bug-4
        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public int numIslands(char[][] grid) {
        //当grip为空的时候
        if (grid == null || grid.length < 1) {
            return 0;
        }
        //bug1-当grip只有一个点的时候，且元素为1的时候，岛屿数为1
        if(grid.length == 1 && grid[0].length == 1){
            if(grid[0][0] == '1') return 1;
            return 0;
        }
        //nr 为行数
        int nr = grid.length;
        //nc 为列数
        int nc = grid[0].length;
        //岛屿数
        int num_islands = 0;
        for (int r = 0; r < nr; r++) {
            //bug2 - 应该是c < nc
            for (int c = 0; c < nc; c++) {
                if (grid[r][c] == '1') {
                    //找到了一个大陆
                    ++num_islands;
                    //找和当前(r,c）点同一大陆的岛屿
                    dfs(grid, r, c);
                }
            }
        }
        return num_islands;
    }
}
