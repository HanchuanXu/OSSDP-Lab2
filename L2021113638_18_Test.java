import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;



public class L2021113638_18_Test {
    /*
    划分原则：
    计算乘积0是重要判据，全为0的数组，空数组，含有部分0的数组，不含0的数组
     */
    @Test
    public void testProductExceptSelf(){
        Solution18 solution  = new Solution18();
        int[] allZeroArr = {0,0,0,0,0};
       assertArrayEquals(new int[]{0,0,0,0,0},solution.productExceptSelf(allZeroArr));
        int[] emptyArr = new int[]{};
        assertArrayEquals(new int[]{}, solution.productExceptSelf(emptyArr));
        int[] nullArr = null;
        assertArrayEquals(null, solution.productExceptSelf(nullArr));
        int[] noZeroArr = new int[]{1,2,3,4};
        assertArrayEquals(new int[]{24,12,8,6}, solution.productExceptSelf(noZeroArr));
        int[] someZeroArr = new int[]{-1,1,0,-3,3};
        assertArrayEquals(new int[]{0,0,9,0,0}, solution.productExceptSelf(someZeroArr));


    }
}
