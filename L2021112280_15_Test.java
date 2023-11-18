import org.junit.Assert;
import org.junit.Test;

public class L2021112280_15_Test {

    /**
     * Strategy：采用等价类划分原则
     *测试目的： 测试比较版本方法是否能输出正确结果
     *测试用例：
     *   1: version1: 1.001.01 version2: 1.01.1
     *   2: version1: 0.11.01  version2: 0.201.01
     *   3: version1: 02.11.02 version2: 01.21.03
     */
    @Test
    public void testSolution1(){
        Solution solution=new Solution();
        String version1="1.001.01";
        String version2="1.01.1";
        Assert.assertEquals(0,solution.compareVersion(version1,version2));
    }

    @Test
    public void testSolution2(){
        Solution solution=new Solution();
        String version1="0.11.01";
        String version2="0.201.01";
        Assert.assertEquals(-1,solution.compareVersion(version1,version2));
    }

    @Test
    public void testSolution3(){
        Solution solution=new Solution();
        String version1="02.11.02";
        String version2="01.21.03";
        Assert.assertEquals(1,solution.compareVersion(version1,version2));
    }


}
