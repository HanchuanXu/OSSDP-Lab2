import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * restoreIpAddress：有前导0 无前导0 全是0
 *
 */
public class L2021112013_14_Test {



    /**
     * 测试有前导0
     * 测试用例：101023
     */
    @Test
    public void testRestore1(){
        List<String> list = new Solution14().restoreIpAddresses("101023");
        List<String> list2 = List.of("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3");
        Assert.assertEquals(list,list2);
    }
    /**
     * 测试无前导0
     * 测试用例：255255255255
     */
    @Test
    public void testRestore2(){
        List<String> list = new Solution14().restoreIpAddresses("255255255255");
        List<String> list2 = List.of("255.255.255.255");
        Assert.assertEquals(list,list2);
    }
    /**
     * 测试全为0
     * 测试用例：0000
     */
    @Test
    public void testRestore3(){
        List<String> list = new Solution14().restoreIpAddresses("0000");
        List<String> list2 = List.of("0.0.0.0");
        Assert.assertEquals(list,list2);
    }
}
