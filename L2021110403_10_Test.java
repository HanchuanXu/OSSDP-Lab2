import org.junit.jupiter.api.Test;

class L2021110403_10_Test {

    /**
     * 等价类划分原则
     * 测试目的： 验证算法正确性
     *  测试用例 ： 结果为0的
     *             结果为正数的
     *             结果为负数的
     */
    @Test
    void fractionAddition() {
        //使用assertion
        assert new Solution10().fractionAddition("-1/2+1/2").equals("0/1");
        assert new Solution10().fractionAddition("-1/2+1/2+1/3").equals("1/3");
        assert new Solution10().fractionAddition("1/3-1/2").equals("-1/6");

    }

    /**
     * 等价类划分
     * 最大公约数为1或是两者为倍数关系
     * 测试目的： 验证辗转相除法算法正确性
     */
    @Test
    void gcd() {
        //使用assertion
        assert new Solution10().gcd(1, 2) == 1;
        assert new Solution10().gcd(2, 4) == 2;
        assert new Solution10().gcd(4, 2) == 2;
        assert new Solution10().gcd(2, 3) == 1;
        assert new Solution10().gcd(3, 2) == 1;
    }
}