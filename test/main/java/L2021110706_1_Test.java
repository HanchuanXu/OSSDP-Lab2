package main.java;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.Assert.assertEquals;

/**
 * ������������ԭ�򣺵ȼ��໮��
 * �ȼ�����Է����ǰ����п��ܵ��������ݣ�������������򻮷ֳ����ɲ��֣�Ȼ���ÿһ������ѡȡ�����д����Ե�������Ϊ����������
 * ʹ�õȼ��໮�ַ�����Ʋ�������Ҫ�������ֵȼ��ࣨ�г��ȼ������ѡȡ��������������
 * ����������ٵĲ��Թ��̽��к�����࣬�Ӷ���֤��Ƴ����Ĳ����������������Ժʹ����ԡ�
 * 1. ��ĸ���룺+ or - or 0
 *            ���� or С��
 * 2. �������룺+ or -
 * 3. ������ࣺ���� or ѭ��С�� or ����С��
 *            + or -
 * 4. �ַ����ȣ�ѭ��С����������104�ַ��� or ѭ��С��������104�ַ���
 */
public class L2021110706_1_Test {

    /**
     * ����fractionToDecimal����
     */
    @Test
    public void fractionToDecimalTest(){
        Solution1 solution = new Solution1();

        // ����Ϊ��
        assertEquals("0.5", solution.fractionToDecimal(1, 2));
        // ����Ϊ��
        assertEquals("-0.5", solution.fractionToDecimal(-1, 2));

        // ��ĸΪ��
        assertEquals("-0.5", solution.fractionToDecimal(-1, 2));
        // ��ĸΪ��
        assertEquals("0.5", solution.fractionToDecimal(-1, -2));
        // ��ĸΪ0
        assertEquals("devided by zero", solution.fractionToDecimal(-1, 0));

        // ���Ϊ����
        assertEquals("2", solution.fractionToDecimal(2, 1));
        // ���Ϊ����С��
        assertEquals("0.5", solution.fractionToDecimal(1, 2));
        // ���Ϊѭ��С��
        assertEquals("0.(3)", solution.fractionToDecimal(1, 3));

        // ���Ϊ��
        assertEquals("3", solution.fractionToDecimal(6, 2));
        // ���Ϊ��
        assertEquals("-3", solution.fractionToDecimal(-6, 2));

        // ���Ϊѭ��С����������104�ַ���
        assertEquals("0.(012)", solution.fractionToDecimal(4, 333));
        // ���Ϊѭ��С��������104�ַ���
        assertEquals("-22.6(66330408357582135001459744612579077084907075062426932178118727867271782450191003164259080434469147", solution.fractionToDecimal(1195314646, -52735252));


    }
}