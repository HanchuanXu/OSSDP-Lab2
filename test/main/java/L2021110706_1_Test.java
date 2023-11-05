package main.java;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.assertEquals;

/**
 * 测试用例总体原则：等价类划分
 * 等价类测试方法是把所有可能的输入数据，即程序的输入域划分成若干部分，然后从每一部分中选取少数有代表性的数据作为测试用例。
 * 使用等价类划分方法设计测试用例要经历划分等价类（列出等价类表）和选取测试用例两步，
 * 它将不能穷举的测试过程进行合理分类，从而保证设计出来的测试用例具有完整性和代表性。
 * 1. 分母输入：+ or - or 0
 *            整数 or 小数
 * 2. 分子输入：+ or -
 * 3. 结果分类：整数 or 循环小数 or 有限小数
 *            + or -
 * 4. 字符长度：循环小数（不超出104字符） or 循环小数（超出104字符）
 */
public class L2021110706_1_Test {

    /**
     * 测试fractionToDecimal方法
     */
    @Test
    public void fractionToDecimalTest(){
        Solution1 solution = new Solution1();

        // 分子为正
        assertEquals("0.5", solution.fractionToDecimal(1, 2));
        // 分子为负
        assertEquals("-0.5", solution.fractionToDecimal(-1, 2));

        // 分母为正
        assertEquals("-0.5", solution.fractionToDecimal(-1, 2));
        // 分母为负
        assertEquals("0.5", solution.fractionToDecimal(-1, -2));
        // 分母为0
        assertEquals("devided by zero", solution.fractionToDecimal(-1, 0));

        // 结果为整数
        assertEquals("2", solution.fractionToDecimal(2, 1));
        // 结果为有限小数
        assertEquals("0.5", solution.fractionToDecimal(1, 2));
        // 结果为循环小数
        assertEquals("0.(3)", solution.fractionToDecimal(1, 3));

        // 结果为正
        assertEquals("3", solution.fractionToDecimal(6, 2));
        // 结果为负
        assertEquals("-3", solution.fractionToDecimal(-6, 2));

        // 结果为循环小数（不超出104字符）
        assertEquals("0.(012)", solution.fractionToDecimal(4, 333));
        // 结果为循环小数（超出104字符）
        assertEquals("-22.6(66330408357582135001459744612579077084907075062426932178118727867271782450191003164259080434469147", solution.fractionToDecimal(1195314646, -52735252));


    }
}