import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;


public class L2021111868_13_Test{
    @Test
    public void testSolution_1() {
        int[] nums={2,2,1,1,0,0};
        Solution13 test =new Solution13();
        test.sortColors(nums);
        int[] num_valid={0,0,1,1,2,2};
        assertArrayEquals(nums,num_valid);
    }
    @Test
    public void testSolution_2(){
        int[] nums={1,2,1,2};
        Solution13 test =new Solution13();
        test.sortColors(nums);
        int[] num_valid={1,1,2,2};
        assertArrayEquals(nums,num_valid);
    }
    @Test
    public void testSolution_3(){
        int[] nums={1,4,3,2,0};
        Solution13 test =new Solution13();
        test.sortColors(nums);
        int[] num_valid={0,1,3,2,4};
        assertArrayEquals(nums,num_valid);
    }
}