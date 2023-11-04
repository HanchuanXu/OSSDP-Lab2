/**
 * @description:
 *
 * 给你一个字符串 s ，请你去除字符串中重复的字母，使得每个字母只出现一次。需保证 返回结果的字典序最小（要求不能打乱其他字符的相对位置）。
 *
 *
 * 示例 1：
 *
 * 输入：s = "bcabc"
 * 输出："abc"
 * 示例 2：
 *
 * 输入：s = "cbacdcbc"
 * 输出："acdb"
 *
 * 1 <= s.length <= 104
 * s 由小写英文字母组成
 */
class Solution2 {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        char[] stack = new char[s.length()];
        int[] stackCount = new int[26];
        int index = -1;
        for (int i = 0; i < s.length(); i++) {
            while (index != -1 && stack[index] > s.charAt(i) && count[stack[index] - 'a'] > 0 && stackCount[s.charAt(i) - 'a'] == 0) {
                stackCount[stack[index] - 'a']--;
                index--;
            }
            if (stackCount[s.charAt(i) - 'a'] == 0) {
                stack[++index] = s.charAt(i);
                stackCount[s.charAt(i) - 'a']++;
            }
            count[s.charAt(i) - 'a']--;
        }

        StringBuilder builder = new StringBuilder();
        while (index != -1) {
            builder.append(stack[index--]);
        }
        return builder.reverse().toString();
    }
}
