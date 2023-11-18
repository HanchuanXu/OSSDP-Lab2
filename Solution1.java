import java.util.HashMap;
import java.util.Map;

/**
 * @description: 给定两个整数，分别表示分数的分子 numerator 和分母 denominator，以 字符串形式返回小数 。
 * <p>
 * 如果小数部分为循环小数，则将循环的部分括在括号内。
 * <p>
 * 如果存在多个答案，只需返回 任意一个 。
 * <p>
 * 对于所有给定的输入，保证 答案字符串的长度小于 104 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：numerator = 1, denominator = 2
 * 输出："0.5"
 * 示例 2：
 * <p>
 * 输入：numerator = 2, denominator = 1
 * 输出："2"
 * 示例 3：
 * <p>
 * 输入：numerator = 4, denominator = 333
 * 输出："0.(012)"
 */
class Solution1 {
	public String fractionToDecimal(int numerator, int denominator) {
		long numeratorLong = numerator;
		long denominatorLong = denominator;
		if (numeratorLong % denominatorLong == 0) {
			return String.valueOf(numeratorLong / denominatorLong);
		}
		StringBuilder sb = new StringBuilder();
		if (numeratorLong < 0 ^ denominatorLong < 0) {
			sb.append('-');
		}
		// 计算整数部分
		numeratorLong = Math.abs(numeratorLong);
		denominatorLong = Math.abs(denominatorLong);
		long integerPart = numeratorLong / denominatorLong;
		sb.append(integerPart);
		// 计算小数部分
		sb.append('.');
		StringBuilder fractionPart = new StringBuilder();
		Map<Long, Integer> remainderIndexMap = new HashMap<>();
		long remainder = numeratorLong % denominatorLong;
		while (remainder != 0 && !remainderIndexMap.containsKey(remainder)) {
			remainderIndexMap.put(remainder, fractionPart.length());
			remainder *= 10;
			fractionPart.append(remainder / denominatorLong);
			remainder %= denominatorLong;
		}
		if (remainder != 0) { // 有循环节
			int insertIndex = remainderIndexMap.get(remainder);
			fractionPart.insert(insertIndex, '(');
			fractionPart.append(')');
		}
		sb.append(fractionPart);
		return sb.toString();
	}
}