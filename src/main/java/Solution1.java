package main.java;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 *
 * 给定两个整数，分别表示分数的分子 numerator 和分母 denominator，以 字符串形式返回小数 。
 *
 * 如果小数部分为循环小数，则将循环的部分括在括号内。
 *
 * 如果存在多个答案，只需返回 任意一个 。
 *
 * 对于所有给定的输入，保证 答案字符串的长度小于 104 。
 *
 * 示例 1：
 *
 * 输入：numerator = 1, denominator = 2
 * 输出："0.5"
 * 示例 2：
 *
 * 输入：numerator = 2, denominator = 1
 * 输出："2"
 * 示例 3：
 *
 * 输入：numerator = 4, denominator = 333
 * 输出："0.(012)"
 *
 */

public class Solution1 {
    public static String fractionToDecimal(int numerator, int denominator) {
        long numeratorLong = (long) numerator;
        long denominatorLong = (long) denominator;
        //除零情况
        if (denominator == 0){
            String answer = "devided by zero";
            return answer;
        }
        if (numeratorLong % denominatorLong == 0) {
            return String.valueOf(numeratorLong / denominatorLong);
        }

        StringBuffer sb = new StringBuffer();
        if (numeratorLong < 0 ^ denominatorLong < 0) {
            sb.append('-');
        }

        // 整数部分
        numeratorLong = Math.abs(numeratorLong);
        denominatorLong = Math.abs(denominatorLong);
        long integerPart = numeratorLong / denominatorLong;
        sb.append(integerPart);

        // 小数部分
        sb.append('.');
        numeratorLong %= denominatorLong;
        Map<Long, Integer> remainderIndexMap = new HashMap<Long, Integer>();
        StringBuffer fractionPart = new StringBuffer();
        int index = 0;
        //循环写小数部分
        while (numeratorLong != 0 && !remainderIndexMap.containsKey(numeratorLong)) {
            remainderIndexMap.put(numeratorLong, index);
            numeratorLong *= 10;
            fractionPart.append(numeratorLong / denominatorLong);
            numeratorLong %= denominatorLong;
            index++;
        }
        if (numeratorLong != 0) { // 有循环节
            int insertIndex = remainderIndexMap.get(numeratorLong);
            fractionPart.insert(insertIndex, '(');
            fractionPart.append(')');
        }
        sb.append(fractionPart.toString());
        // 在return之前添加长度检查
        String result = sb.toString();
        if (result.length() > 104) {
            result = result.substring(0, 104); // 截取前104个字符
            System.out.println("out of length limit:104    only print forward 104 chars");
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(1195314646,-52735252));
        System.out.println(fractionToDecimal(-1,-0));
    }
}

