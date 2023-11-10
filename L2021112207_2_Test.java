import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
class L2021112207_2_Test {

    @Test
    void testRestoreIpAddresses() {
        // 测试用例设计总体原则：等价类划分

        // 有效的 IP 地址
        testWithInput("25525511135", List.of("255.255.11.135", "255.255.111.35"));

        // 仅包含数字 0 的情况
        testWithInput("0000", List.of("0.0.0.0"));

        // 包含数字 0-9 的混合情况
        testWithInput("101023", List.of("1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3"));

        // 包含非法字符的情况
        testWithInput("192.168@1.1", List.of());

        // 边界情况，空字符串
        testWithInput("", List.of());

        // 边界情况，长度小于4的字符串
        testWithInput("123", List.of());

        // 边界情况，长度大于12的字符串
        testWithInput("123456789012", List.of());
    }

    private void testWithInput(String input, List<String> expected) {
        Solution solution = new Solution();
        List<String> result = solution.restoreIpAddresses(input);
        assertIterableEquals(expected, result, "Failed for input: " + input);
    }
}
