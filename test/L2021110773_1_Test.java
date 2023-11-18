import org.junit.Assert;
import org.junit.Test;
/**
 边界值分析原则：特别关注输入的边界情况，包括最小值、最大值、临界值等。这些边界值通常是程序处理边界条件和特殊情况的关键。
 测试方法1：testFractionToDecimalWithSimpleFraction
    目的：测试简单分数的转换结果
    测试用例：numerator = 1, denominator = 2
    预期结果："0.5"
 测试方法2：testFractionToDecimalWithInteger
    目的：测试整数的转换结果
    测试用例：numerator = 2, denominator = 1
    预期结果："2"
 测试方法3：testFractionToDecimalWithRepeatingDecimal
    目的：测试循环小数的转换结果
    测试用例：numerator = 4, denominator = 333
    预期结果："0.(012)"
 */
public class L2021110773_1_Test {
	@Test
	public void testFractionToDecimal() {
		Solution1 solution1 = new Solution1();
		Assert.assertEquals("0.5", solution1.fractionToDecimal(1, 2));
		Assert.assertEquals("2", solution1.fractionToDecimal(2, 1));
		Assert.assertEquals("0.(012)", solution1.fractionToDecimal(4, 333));
	}
}