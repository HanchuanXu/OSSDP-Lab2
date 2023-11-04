import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L2021111170_12_Test {

    /**
     * 测试用例规约：
     * 1.两个数全都是0
     * 2.两个数有一个是0
     * 3.两个数全是正数
     */
    @Test
    public void multiplyTest() {
        Solution12 solution = new Solution12();
        assertEquals(solution.multiply("0", "0"), "0");
        assertEquals(solution.multiply("0", "124532"), "0");
        assertEquals(solution.multiply("769", "2432"), "1870208");

    }
}