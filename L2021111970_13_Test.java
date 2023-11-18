package solution;

import static  org.junit.Assert.*;
import org.junit.Test;

/*
 * 13题测试
 * Testing Class Solution
 */

// Testing strategy
// 等价类划分：只有1种颜色，只有2种颜色，有三种颜色；乱序，顺序
public class L2021111970_13_Test {
    // 测试只有1和2两种颜色，乱序
    // 测试用例：int[] nums = {1,2,2,2,1,1,1};
    @Test
    public void test1(){
        Solution s = new Solution();
        int[] nums = {1,2,2,2,1,1,1};
        s.sortColors(nums);
        int[] expect = {1,1,1,1,2,2,2};
        assertArrayEquals(expect, nums);
    }
    // 测试只有0和1两种颜色，乱序
    // 测试用例：int[] nums = {1,0,0,1,0,1,0,0};
    @Test
    public void test2(){
        Solution s = new Solution();
        int[] nums = {1,0,0,1,0,1,0,0};
        s.sortColors(nums);
        int[] expect = {0,0,0,0,0,1,1,1};
        assertArrayEquals(expect, nums);
    }
    // 测试只有0和2两种颜色，乱序
    // 测试用例：int[] nums = {0,0,2,2,0,0,0};
    @Test
    public void test3(){
        Solution s = new Solution();
        int[] nums = {0,0,2,2,0,0,0};
        s.sortColors(nums);
        int[] expect = {0,0,0,0,0,2,2};
        assertArrayEquals(expect, nums);
    }
    // 测试有三种颜色，乱序
    // 测试用例：int[] nums = {0,2,2,0,1,1,1};
    @Test
    public void test4(){
        Solution s = new Solution();
        int[] nums = {0,2,2,0,1,1,1};
        s.sortColors(nums);
        int[] expect = {0,0,1,1,1,2,2};
        assertArrayEquals(expect, nums);
    }
    // 测试有一种颜色
    // 测试用例：int[] nums = {1,1,1,1,1,1,1};
    @Test
    public void test5(){
        Solution s = new Solution();
        int[] nums = {1,1,1,1,1,1,1};
        s.sortColors(nums);
        int[] expect = {1,1,1,1,1,1,1};
        assertArrayEquals(expect, nums);
    }
    // 测试有一种颜色
    // 测试用例：int[] nums = {0,0,0,0,0};
    @Test
    public void test6(){
        Solution s = new Solution();
        int[] nums = {0,0,0,0,0};
        s.sortColors(nums);
        int[] expect = {0,0,0,0,0};
        assertArrayEquals(expect, nums);
    }
    // 测试有一种颜色
    // 测试用例：int[] nums = {2,2,2,2,2,2};
    @Test
    public void test7(){
        Solution s = new Solution();
        int[] nums = {2,2,2,2,2,2};
        s.sortColors(nums);
        int[] expect = {2,2,2,2,2,2};
        assertArrayEquals(expect, nums);
    }
    // 测试有三种颜色，顺序
    // 测试用例：int[] nums = {0,0,1,1,2,2};
    @Test
    public void test8(){
        Solution s = new Solution();
        int[] nums = {0,0,1,1,2,2};
        s.sortColors(nums);
        int[] expect = {0,0,1,1,2,2};
        assertArrayEquals(expect, nums);
    }
}
