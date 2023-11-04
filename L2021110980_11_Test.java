
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class L2021110980_11_Test{
    public static int[][] convertListListToIntArray(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
            .map(list -> list.stream().mapToInt(Integer::intValue).toArray())
            .toArray(int[][]::new);
    }
    @Test
    public void testCase1(){
        Solution solve=new Solution();
        int[] nums={0,1,1};
        int[][] res={};
        assertArrayEquals(res,convertListListToIntArray(solve.threeSum(nums)));
    }
    @Test 
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
     * 这里是没有答案但是有正负的情况
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
     * 测试多个0
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