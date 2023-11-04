
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
/**
 * 
 * 测试类划分原则
 * 长度是否为3
 * 是否有结果，结果是否为多个
 * 边界值：全为0的情况
 */
public class L2021110980_11_Test{
    public static int[][] convertListListToIntArray(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
            .map(list -> list.stream().mapToInt(Integer::intValue).toArray())
            .toArray(int[][]::new);
    }
    @Test
    /**
     * 长度为3，无结果
     * 输入[0,1,1]
     * 输出[]
     */
    public void testCase1(){
        Solution solve=new Solution();
        int[] nums={0,1,1};
        int[][] res={};
        assertArrayEquals(res,convertListListToIntArray(solve.threeSum(nums)));
    }
    @Test 
    /**
     * 长度不为3，有结果，有多个结果
     * 输入[-1,0,1,2,-1,-4]
     * 输出[[-1,-1,2],[-1,0,1]]
     */
    public void testCase2(){
        Solution solve=new Solution();
        int[] nums={-1,0,1,2,-1,-4};
        int[][] res={
            {-1,-1,2},
            {-1,0,1}
        };
        assertArrayEquals(res,convertListListToIntArray(solve.threeSum(nums)));
    }
    @Test
    /**
     * 长度为3，全是0
     * 输入[0,0,0]
     * 输出[[0,0,0]]
     */
    public void testCase3(){
        Solution solve=new Solution();
        int[] nums={0,0,0};
        int[][] res={
            {0,0,0}
        };
        assertArrayEquals(res,convertListListToIntArray(solve.threeSum(nums)));
    }
    @Test
    /**
     * 长度为3，无结果
     * 输入[0,2,-1]
     * 输出[]
     */
    public void testNoAns(){
        Solution solve=new Solution();
        int[] nums={0,2,-1};
        int[][] res={
        };
        assertArrayEquals(res,convertListListToIntArray(solve.threeSum(nums)));
    }
    @Test
    /**
     * 长度不为3，多个0
     * 输入[0,0,0,0,0,0]
     * 输出[[0,0,0]]
     */
    public void testMoreZero(){
        Solution solve=new Solution();
        int[] nums={0,0,0,0,0,0};
        int[][] res={
            {0,0,0}
        };
        assertArrayEquals(res,convertListListToIntArray(solve.threeSum(nums)));
    }
}