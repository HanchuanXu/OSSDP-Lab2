import java.util.Arrays;

/**
 * @description:
 *
 * 给定一个无序的数组 nums，返回 数组在排序之后，相邻元素之间最大的差值 。如果数组元素个数小于 2，则返回 0 。
 *
 * 您必须编写一个在「线性时间」内运行并使用「线性额外空间」的算法。
 *
 *
 *
 * 示例 1:
 *
 * 输入: nums = [3,6,9,1]
 * 输出: 3
 * 解释: 排序后的数组是 [1,3,6,9], 其中相邻元素 (3,6) 和 (6,9) 之间都存在最大差值 3。
 * 示例 2:
 *
 * 输入: nums = [10]
 * 输出: 0
 * 解释: 数组元素个数小于 2，因此返回 0。
 *
 *
 * 提示:
 *
 * 1 <= nums.length <= 105
 * 0 <= nums[i] <= 109
 *
 */
class Solution4 {
    //原来代码看不懂想干啥，网上搜寻后看着有点像桶排序
    //于是决定用桶排序的方法重写代码解决相关问题
    //创建若干个桶，每个桶负责固定区间的元素，按照一定规则（在哪个区间内）将元素放进桶中
    //维护每个桶的最大值与最小值，然后遍历桶，找出之间最大的差值即可（注意，最大差值一定在桶间）
    public int maximumGap(int[] nums) {

        int n = nums.length;
        //数组元素个数小于 2
        if (n < 2) {
            return 0;
        }

        //数组最大值,最小值
        int maxVal = Arrays.stream(nums).max().getAsInt();
        int minVal = Arrays.stream(nums).min().getAsInt();

        if (maxVal == minVal) {
            return 0;
        }

        //定义桶的区间与个数
        int section = Math.max(1, (maxVal - minVal) / (n - 1));
        int bucketSize = (maxVal - minVal) / section + 1;

        //维护每个桶的最小值和最大值
        int[] min_bucket = new int[bucketSize];
        int[] max_bucket = new int[bucketSize];
        Arrays.fill(min_bucket, Integer.MAX_VALUE);
        Arrays.fill(max_bucket, -1);

        //将数据放入桶中
        for (int i = 0; i < n; i++) {
            // 确定当前值在哪个桶
            int idx = (nums[i] - minVal) / section;
            // 更新最大值和最小值
            min_bucket[idx] = Math.min(min_bucket[idx], nums[i]);
            max_bucket[idx] = Math.max(max_bucket[idx], nums[i]);
        }
        int ret = 0;
        // 前一个桶的最大值
        int prevMax = -1;
        for (int i = 0; i < bucketSize; i++) {
            // 桶里没有元素
            if (max_bucket[i] == -1) {
                continue;
            }
            // 计算桶间的最大值（插值一定在桶间）
            if (prevMax != -1) {
                ret = Math.max(ret, min_bucket[i] - prevMax);
            }
            prevMax = max_bucket[i];
        }

        return ret;

    }
}