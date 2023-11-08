/*等价类划分原则：将输入域划分为不同的等价类，以确保覆盖各种可能的情况。
方法的测试目的：在这个例子中，productExceptSelf 方法的主要目的是计算除自身以外数组中所有元素的乘积。因此，我们需要测试该方法是否能正确计算出这个结果，并覆盖边界情况。
测试用例设计：我们可以设计以下测试用例来测试该方法：
测试包含正整数的输入数组
测试包含负整数的输入数组
测试包含零的输入数组
测试输入数组长度为1的情况
测试输入数组长度为2的情况
测试输入数组长度为3及以上的一般情况

 */
public class L2021113290_18_Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

//

        // 测试用例1: 包含正整数的输入数组
        int[] nums2 = {1, 2, 3, 4};
        int[] result2 = solution.productExceptSelf(nums2);
        System.out.println("Test Case 1:");
        printArray(result2);

        // 测试用例2: 包含负整数的输入数组
        int[] nums3 = {1, -2, 3, -4};
        int[] result3 = solution.productExceptSelf(nums3);
        System.out.println("Test Case 2:");
        printArray(result3);

        // 测试用例3: 包含零的输入数组
        int[] nums4 = {1, 0, 3, 4};
        int[] result4 = solution.productExceptSelf(nums4);
        System.out.println("Test Case 3:");
        printArray(result4);

        // 测试用例4: 输入数组长度为1
        int[] nums5 = {2};
        int[] result5 = solution.productExceptSelf(nums5);
        System.out.println("Test Case 4:");
        printArray(result5);

        // 测试用例5: 输入数组长度为2
        int[] nums6 = {2, 3};
        int[] result6 = solution.productExceptSelf(nums6);
        System.out.println("Test Case 5:");
        printArray(result6);

        // 测试用例6: 输入数组长度为3及以上的一般情况
        int[] nums7 = {1, 2, 3, 4, 5};
        int[] result7 = solution.productExceptSelf(nums7);
        System.out.println("Test Case 6:");
        printArray(result7);
    }

    // 辅助方法：打印数组
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}