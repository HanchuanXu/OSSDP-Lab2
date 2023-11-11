import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
 * @Description:
 * ## 字符串相乘
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 * 注意：不能使用任何内置的 BigInteger 库或直接将输入转换为整数。
 *
 *  示例 1:
 *  输入: num1 = "2", num2 = "3"
 * 输出: "6"
 *
 * 示例 2:
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 *
 */

/*
测试划分：
较小整数间的相乘，整数与0的相乘，较大整数间的相乘
 */
public class _2021111495_Solution12_Test {


    @Test
    public void testMultiply(){
        Solution12 sl=new Solution12();
        assertEquals("2",sl.multiply("1","2"));
        assertEquals("0",sl.multiply("0","2"));
        assertEquals("670592745",sl.multiply("12345","54321"));

    }


}
