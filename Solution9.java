import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description:
 *
 * 给定一组 n 人（编号为 1, 2, ..., n）， 我们想把每个人分进任意大小的两组。每个人都可能不喜欢其他人，那么他们不应该属于同一组。
 *
 * 给定整数 n 和数组 dislikes ，其中 dislikes[i] = [ai, bi] ，表示不允许将编号为 ai 和  bi的人归入同一组。当可以用这种方法将所有人分进两组时，返回 true；否则返回 false。
 *
 *
 *
 * 示例 1：
 *
 * 输入：n = 4, dislikes = [[1,2],[1,3],[2,4]]
 * 输出：true
 * 解释：group1 [1,4], group2 [2,3]
 * 示例 2：
 *
 * 输入：n = 3, dislikes = [[1,2],[1,3],[2,3]]
 * 输出：false
 * 示例 3：
 *
 * 输入：n = 5, dislikes = [[1,2],[2,3],[3,4],[4,5],[1,5]]
 * 输出：false
 *
 *
 * 提示：
 *
 * 1 <= n <= 2000
 * 0 <= dislikes.length <= 104
 * dislikes[i].length == 2
 * 1 <= dislikes[i][j] <= n
 * ai < bi
 * dislikes 中每一组都 不同
 *
 */
class Solution9 {

    public boolean possibleBipartition(int n, int[][] dislikes) {
        int[] fa = new int[n + 1];
        //用零填充
        Arrays.fill(fa, -1);

        List<Integer>[] g = new List[n+1];
        //少添加一个数组，会数组越界
        for (int i = 0; i < n+1; ++i) {
            g[i] = new ArrayList<Integer>();
        }
        //下标为每个人的编号，总结每个人不喜欢的人的编号（漏加大括号）
        for (int[] p : dislikes) {
            g[p[0]].add(p[1]);
            g[p[1]].add(p[0]);
        }
        //将同一个节点的不喜欢节点连接在一起
        for (int i = 1; i <= n; ++i) {
            for (int j = 0; j < g[i].size(); ++j) {
                unit(g[i].get(0), g[i].get(j), fa);
                //如果一个节点与它的不喜欢节点相连则矛盾
                if (isconnect(i, g[i].get(j), fa)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 将两个节点置入同个并查集
     * @param x 节点1
     * @param y 节点2
     * @param fa 所有节点的父节点集合
     */
    public void unit(int x, int y, int[] fa) {
        x = findFa(x, fa);
        y = findFa(y, fa);
        //若已在一个并查集内
        if (x == y) {
            return;
        }
        //交换x,y
        if (fa[x] <= fa[y]) {
            int temp = x;
            x = y;
            y = temp;
        }
        //错误，删除
        //fa[x] += fa[y];
        fa[y] = x;
    }

    /**
     * 判断两个节点是否在同一个并查集内
     * @param x 节点1
     * @param y 节点2
     * @param fa 所有节点的父节点集合
     * @return 若在同个并查集内返回true，否则返回false
     */
    public boolean isconnect(int x, int y, int[] fa) {
        x = findFa(x, fa);
        y = findFa(y, fa);
        return x == y;
    }

    /**
     * 寻找节点所在并查集的根节点
     * @param x 所要寻找的节点
     * @param fa 所有节点的父节点集合
     * @return 节点的父节点编号
     */
    public int findFa(int x, int[] fa) {
        //如果fa[x]<0，则返回x，否则向上查找(大于小于错误）
        return fa[x] < 0 ? x : (fa[x] = findFa(fa[x], fa));
    }
}
