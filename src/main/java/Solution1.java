import java.util.HashMap;
import java.util.Map;

/**
 * @description: ���������������ֱ��ʾ�����ķ��� numerator �ͷ�ĸ denominator���� �ַ�����ʽ����С�� ��
 * <p>
 * ���С������Ϊѭ��С������ѭ���Ĳ������������ڡ�
 * <p>
 * ������ڶ���𰸣�ֻ�践�� ����һ�� ��
 * <p>
 * �������и��������룬��֤ ���ַ����ĳ���С�� 104 ��
 * <p>
 * ʾ�� 1��
 * <p>
 * ���룺numerator = 1, denominator = 2
 * �����"0.5"
 * ʾ�� 2��
 * <p>
 * ���룺numerator = 2, denominator = 1
 * �����"2"
 * ʾ�� 3��
 * <p>
 * ���룺numerator = 4, denominator = 333
 * �����"0.(012)"
 */
public class Solution1 {
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
		// ������������
		numeratorLong = Math.abs(numeratorLong);
		denominatorLong = Math.abs(denominatorLong);
		long integerPart = numeratorLong / denominatorLong;
		sb.append(integerPart);
		// ����С������
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
		if (remainder != 0) { // ��ѭ����
			int insertIndex = remainderIndexMap.get(remainder);
			fractionPart.insert(insertIndex, '(');
			fractionPart.append(')');
		}
		sb.append(fractionPart);
		return sb.toString();
	}
}