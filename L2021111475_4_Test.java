import org.junit.Test;
import static org.junit.Assert.*;

public class L2021111475_4_Test {

    /**输入合法性
     * 1 <= nums.length <= 105
     * 0 <= nums[i] <= 109
     * 输入合理性
     * 数组个数小于2
     **/
    @Test
    //测试正常功能
    public void maximumGap1() {
        int test1[] = new int[]{3,6,1,9,23,10};
        Solution4 s = new Solution4();
        assertEquals(13,s.maximumGap(test1));
    }

    @Test
    //测试正常功能
    public void maximumGap2() {
        int test2[] = new int[]{10};
        Solution4 s = new Solution4();
        assertEquals(0,s.maximumGap(test2));
    }

    @Test
    //测试正常功能
    public void maximumGap3() {
        int test3[] = new int[106];
        Solution4 s = new Solution4();
        assertEquals(-1,s.maximumGap(test3));
    }

    @Test
    //测试正常功能
    public void maximumGap4() {
        int test4[] = new int[]{3,-1,1,9,23,10};
        Solution4 s = new Solution4();
        assertEquals(-1,s.maximumGap(test4));
    }

    @Test
    //测试正常功能
    public void maximumGap5() {
        int test5[] = new int[]{3,6,1,9,23,110};
        Solution4 s = new Solution4();
        assertEquals(-1,s.maximumGap(test5));
    }
}