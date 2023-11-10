import org.junit.jupiter.api.Test;

public class L2021112822_16_Test {
    /**
     * 类型一：数据全为0，检验输出是否符合数字书写规范
     * testData={0,0}
     * target="0"
     */
    @Test
    public void test1(){
      Solution s = new Solution();
      int[] testData = new int[]{0,0};
      String result = s.largestNumber(testData);
      String target = "0";
      assert(result.equals(target));
    }
    /**
     * 类型二：边界检查，测试int边界是否可以完成算法
     * testData={2147483647,34,45,789}
     * result= "78945342147483647"
     */
    @Test
    public void test2(){
        Solution s = new Solution();
        int[] testData = new int[]{2147483647,34,45,789};
        String result = s.largestNumber(testData);
        String target = "78945342147483647";
        assert(result.equals(target));
    }
    /**
     * 类型三：常规情况
     * testData={159,0,87156,23,45,1}
     * result=87156452315910
     */
    @Test
    public void test3(){
        Solution s = new Solution();
        int[] testData = new int[]{159,0,87156,23,45,1};
        String result = s.largestNumber(testData);
        String target = "87156452315910";
        assert(result.equals(target));
    }
    /**
     * 类型四：数字实际大小较大，但是前序数字小于其他数
     * testData={3456,456,56,6}
     * result="6564563456"
     */
    @Test
    public void test4(){
        Solution s = new Solution();
        int[] testData = new int[]{3456,456,56,6};
        String result = s.largestNumber(testData);
        String target = "6564563456";
        assert(result.equals(target));
    }
    /**
     * 类型五：数字实际大小较大，前序数字也大于其他数
     * testData={987654,87654,7654,654,54,4}
     * result="987654876547654654544"
     */
    @Test
    public void test5(){
        Solution s = new Solution();
        int[] testData = new int[]{987654,87654,7654,654,54,4};
        String result = s.largestNumber(testData);
        String target = "987654876547654654544";
        assert(result.equals(target));
    }

}
