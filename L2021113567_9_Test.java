import org.junit.Assert;
import org.junit.*;

/**
 * possibleBipartition:
 * 等价类划分： 不能将所有人分成两组 / 能将所有人分成两组
 * <p>
 * unit:
 * 等价类划分：  属于同一个并查集 / 不属于同一个并查集
 * <p>
 * isconnect:
 * 等价类划分：  属于同一个并查集 / 不属于同一个并查集
 * <p>
 * findFa:
 * 等价类划分：  x是并查集代表 / x不是并查集代表，但与并查集代表直接连接 / x不是并查集代表，且与并查集代表不直接连接
 */
public class L2021113567_9_Test {

    /**
     * 测试不能将所有人分成两组的情况
     * 3个人，[[1,2],[1,3],[2,3]]互不喜欢
     */
    @Test
    public void possibleBipartitionTest1() {
        int[][] arr = {{1, 2}, {1, 3}, {2, 3}};
        boolean res = new Solution9().possibleBipartition(3, arr);
        Assert.assertEquals(false, res);
    }

    /**
     * 测试能将所有人分成两组的情况
     * 4个人，[[1,2],[1,3],[2,4]]互不喜欢
     */
    @Test
    public void possibleBipartitionTest2() {
        int[][] arr = {{1, 2}, {1, 3}, {2, 4}};
        boolean res = new Solution9().possibleBipartition(4, arr);
        Assert.assertEquals(true, res);
    }

    /**
     * 测试不能将所有人分成两组的情况
     * 5个人，[[1,2],[2,3],[3,4],[4,5],[1,5]]互不喜欢
     */
    @Test
    public void possibleBipartitionTest3() {
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}};
        boolean res = new Solution9().possibleBipartition(5, arr);
        Assert.assertEquals(false, res);
    }

    /**
     * 测试能将所有人分成两组的情况
     * 5个人，[[1,2],[2,3],[3,4],[4,5]]互不喜欢
     */
    @Test
    public void possibleBipartitionTest4() {
        int[][] arr = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        boolean res = new Solution9().possibleBipartition(5, arr);
        Assert.assertEquals(true, res);
    }

    /**
     * x,y属于同一个并查集
     * 1，3分别代表一个并查集，2的父亲是1，1和2属于同一个并查集
     */
    @Test
    public void unitTest1() {
        int[] fa = {-1, -2, 1, -1};
        new Solution9().unit(1, 2, fa);
        Assert.assertArrayEquals(new int[]{-1, -2, 1, -1}, fa);
    }

    /**
     * x,y不属于同一个并查集
     * 有两个并查集3和4，1属于3，2属于4
     */
    @Test
    public void unitTest2() {
        int[] fa = {-1, 3, 4, -2, -2};
        new Solution9().unit(1, 2, fa);
        Assert.assertArrayEquals(new int[]{-1, 3, 4, 4, -4}, fa);
    }

    /**
     * 属于同一个并查集
     * 1，3分别代表一个并查集，2的父亲是1，1和2属于同一个并查集
     */
    @Test
    public void isconnectTest1() {
        int[] fa = {-1, -2, 1, -1};
        boolean res = new Solution9().isconnect(1, 2, fa);
        Assert.assertEquals(true, res);
    }

    /**
     * 不属于同一个并查集
     * 有两个并查集3和4，1属于3，2属于4
     */
    @Test
    public void isconnectTest2() {
        int[] fa = {-1, 3, 4, -2, -2};
        boolean res = new Solution9().isconnect(1, 2, fa);
        Assert.assertEquals(false, res);
    }

    /**
     * x就是并查集代表
     */
    @Test
    public void findFaTest1() {
        int[] fa = {-1, -2, 1, -1};
        int res = new Solution9().findFa(1, fa);
        Assert.assertEquals(1, res);
    }

    /**
     * x不是并查集代表，但与并查集代表直接连接
     */
    @Test
    public void findFaTest2() {
        int[] fa = {-1, -2, 1, -1};
        int res = new Solution9().findFa(2, fa);
        Assert.assertEquals(1, res);
    }

    /**
     * x不是并查集代表，且与并查集代表不直接连接
     */
    @Test
    public void findFaTest3() {
        int[] fa = {-1, -3, 1, 2};
        int res = new Solution9().findFa(3, fa);
        Assert.assertEquals(1, res);
        Assert.assertArrayEquals(new int[]{-1, -3, 1, 1}, fa);
    }
}
