import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class L2021111039_12_Test {
    /*
    测试目的：测试multiply方法
    划分等价类：
    依据是否为0分为：均为正数、正数与0相乘、0与0相乘（共三个测试用例）
     */

    @Test
    public void multiplyTest() {
        Solution12 s = new Solution12();
        //均为正数
        String num1 = "123";
        String num2 = "456";
        assertEquals("56088",s.multiply(num1,num2));
        //0与正数
        String num3 = "0";
        assertEquals("0",s.multiply(num1,num3));
        //0与0
        String num4 = "0";
        assertEquals("0",s.multiply(num3,num4));
    }

    /*
    测试目的：测试addStrings方法
    划分等价类：
    依据是否为0分为：均为正数、正数与0相加、0与0相加（共三个测试用例）
     */
    @Test
    public void addStringsTest(){
        Solution12 s = new Solution12();
        //均为正数
        String num1 = "123";
        String num2 = "345";
        assertEquals("468",s.addStrings(num1,num2));
        //0与正数
        String num3 = "0";
        assertEquals("123",s.addStrings(num1,num3));
        //0与0
        String num4 = "0";
        assertEquals("0",s.addStrings(num3,num4));
    }
}
