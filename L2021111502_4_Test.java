import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * 用例设计总体原则：等价类划分原则
 * 分为数组元素<2;一般；等差；全相等；极大差距
 */
public class L2021111502_4_Test {

    /**
     * 数组元素小于2
     */
    @Test public void test1(){
        Solution4 s =new Solution4();
        int[] nums={10};
        assertEquals(0,s.maximumGap(nums));

    }
    /**
     * 一般测试
     */
    @Test public void test2(){
        Solution4 s =new Solution4();
        int[] nums={3, 6, 9, 1};
        assertEquals(3,s.maximumGap(nums));

    }
    /**
     * 等差测试
     */
    @Test public void test3(){
        Solution4 s =new Solution4();
        int[] nums={5, 10, 15, 20, 25, 30};
        assertEquals(5,s.maximumGap(nums));

    }
    /**
     * 全相等测试
     */
    @Test public void test4(){
        Solution4 s =new Solution4();
        int[] nums={2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        assertEquals(0,s.maximumGap(nums));

    }
    /**
     * 极大差距测试
     */
    @Test public void test5(){
        Solution4 s =new Solution4();
        int[] nums={1, 2, 3, 4, 5, 6, 7, 8, 100};
        assertEquals(92,s.maximumGap(nums));

    }
}