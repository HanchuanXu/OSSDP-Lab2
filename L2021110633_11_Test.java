import org.junit.Test;

/**
 * 测试类划分原则：等价类划分
 */
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class L2021110633_11_Test {
    /**
     * 所有都不相同
     */
    @Test
    public void Test1(){
        Solution Solution = new Solution();
        int nums[] = {1,2,3,4,5,6,-1,-2,-3};
        List<List<Integer>> result = Solution.threeSum(nums);
        System.out.println(result);

        //[[-3, -2, 5], [-3, -1, 4], [-3, 1, 2], [-2, -1, 3]]
        List<List<Integer>> real_result = new ArrayList<List<Integer>>();
        List<Integer> r1= new ArrayList<Integer>();
        r1.add(-3);
        r1.add(-2);
        r1.add(5);
        List<Integer> r2= new ArrayList<Integer>();
        r2.add(-3);
        r2.add(-1);
        r2.add(4);
        List<Integer> r3= new ArrayList<Integer>();
        r3.add(-3);
        r3.add(1);
        r3.add(2);
        List<Integer> r4= new ArrayList<Integer>();
        r4.add(-2);
        r4.add(-1);
        r4.add(3);
        real_result.add(r1);
        real_result.add(r2);
        real_result.add(r3);
        real_result.add(r4);
        assertEquals(real_result,result);

    }
    /**
     * 有两个相同的数
     * a = 1
     * b = 1
     */
    @Test
    public void Test2(){
        Solution Solution = new Solution();
        int nums[] = {1,1,2,3,4,5,6,-1,-2,-3};
        List<List<Integer>> result = Solution.threeSum(nums);
        System.out.println(result);

        //[[-3, -2, 5], [-3, -1, 4], [-3, 1, 2], [-2, -1, 3], [-2, 1, 1]]
        List<List<Integer>> real_result = new ArrayList<List<Integer>>();
        List<Integer> r1= new ArrayList<Integer>();
        r1.add(-3);
        r1.add(-2);
        r1.add(5);
        List<Integer> r2= new ArrayList<Integer>();
        r2.add(-3);
        r2.add(-1);
        r2.add(4);
        List<Integer> r3= new ArrayList<Integer>();
        r3.add(-3);
        r3.add(1);
        r3.add(2);
        List<Integer> r4= new ArrayList<Integer>();
        r4.add(-2);
        r4.add(-1);
        r4.add(3);
        List<Integer> r5= new ArrayList<Integer>();
        r5.add(-2);
        r5.add(1);
        r5.add(1);
        real_result.add(r1);
        real_result.add(r2);
        real_result.add(r3);
        real_result.add(r4);
        real_result.add(r5);

        assertEquals(real_result,result);

    }/**
     * 三个数相同的数
     * a = 0
     * b = 0
     * c = 0
     */
    @Test
    public void Test3(){
        Solution Solution = new Solution();
        int nums[] = {0,0,0,1,2,3,4,5,6,-1,-2,-3};
        List<List<Integer>> result = Solution.threeSum(nums);
        System.out.println(result);

        //[[-3, -2, 5], [-3, -1, 4], [-3, 0, 3], [-3, 1, 2], [-2, -1, 3], [-2, 0, 2], [-1, 0, 1], [0, 0, 0]]
        List<List<Integer>> real_result = new ArrayList<List<Integer>>();
        List<Integer> r1= new ArrayList<Integer>();
        r1.add(-3);
        r1.add(-2);
        r1.add(5);
        List<Integer> r2= new ArrayList<Integer>();
        r2.add(-3);
        r2.add(-1);
        r2.add(4);
        List<Integer> r3= new ArrayList<Integer>();
        r3.add(-3);
        r3.add(0);
        r3.add(3);
        List<Integer> r4= new ArrayList<Integer>();
        r4.add(-3);
        r4.add(1);
        r4.add(2);
        List<Integer> r5= new ArrayList<Integer>();
        r5.add(-2);
        r5.add(-1);
        r5.add(3);
        List<Integer> r6= new ArrayList<Integer>();
        r6.add(-2);
        r6.add(0);
        r6.add(2);
        List<Integer> r7= new ArrayList<Integer>();
        r7.add(-1);
        r7.add(0);
        r7.add(1);
        List<Integer> r8= new ArrayList<Integer>();
        r8.add(0);
        r8.add(0);
        r8.add(0);
        real_result.add(r1);
        real_result.add(r2);
        real_result.add(r3);
        real_result.add(r4);
        real_result.add(r5);
        real_result.add(r6);
        real_result.add(r7);
        real_result.add(r8);

        assertEquals(real_result,result);

    }

}
