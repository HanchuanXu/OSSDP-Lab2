import org.junit.Assert;
import org.junit.Test;



public class L2021113647_18_Test {
    //全部正数
    @Test
    public void test1(){
        int input[]={1,2,3,4};
        int output[];
        Solution solu =new Solution();
        output=solu.productExceptSelf(input);
        Assert.assertArrayEquals(new int[]{24,12,8,6},output);
    }

    //全为负数
    @Test
    public void test2(){
        int input[]={-1,-2,-3,-4};
        int output[];
        Solution solu =new Solution();
        output=solu.productExceptSelf(input);
        Assert.assertArrayEquals(new int[]{-24,-12,-8,-6},output);
    }

    //正数负数都有
    @Test
    public void test3(){
        int input[]={-1,2,-3,4};
        int output[];
        Solution solu =new Solution();
        output=solu.productExceptSelf(input);
        Assert.assertArrayEquals(new int[]{-24,12,-8,6},output);
    }
    //包含0，正数
    @Test
    public void test4(){
        int input[]={1,1,0,3,3};
        int output[];
        Solution solu =new Solution();
        output=solu.productExceptSelf(input);
        Assert.assertArrayEquals(new int[]{0,0,9,0,0},output);
    }
    //0和负数
    @Test
    public void test5(){
        int input[]={-1,-1,0,-3,-3};
        int output[];
        Solution solu =new Solution();
        output=solu.productExceptSelf(input);
        Assert.assertArrayEquals(new int[]{0,0,9,0,0},output);
    }

    //0，正数，负数
    @Test
    public void test6(){
        int input[]={1,-1,0,3,-3};
        int output[];
        Solution solu =new Solution();
        output=solu.productExceptSelf(input);
        Assert.assertArrayEquals(new int[]{0,0,9,0,0},output);
    }
}

