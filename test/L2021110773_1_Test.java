import org.junit.Assert;
import org.junit.Test;

public class L2021110773_1_Test {
	@Test
	public void testFractionToDecimal() {
		Solution1 solution1 = new Solution1();
		Assert.assertEquals("0.5", solution1.fractionToDecimal(1, 2));
		Assert.assertEquals("2", solution1.fractionToDecimal(2, 1));
		Assert.assertEquals("0.(012)", solution1.fractionToDecimal(4, 333));
	}
}