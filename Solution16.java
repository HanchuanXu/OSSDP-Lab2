import java.util.*;

/*
 * @Description
 * 最大数
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 *
 * 示例 1：
 * 输入：nums = [10,2]
 * 输出："210"
 * 示例 2：
 * 输入：nums = [3,30,34,5,9]
 * 输出："9534330"
 */
class Solution {
    //添加空构造方法
    public Solution(){

    }
    public String largestNumber(int[] nums) {
        //修改为属性length
        int n = nums.length;
        // 转换成包装类型，以便传入 Comparator 对象（此处为 lambda 表达式）
        Integer[] numsArr = new Integer[n];
        //数组引用为[]
        for (int i = 0; i < n; i++) {
            numsArr[i] = nums[i];
        }
        //防止乘法越界，修改排序方法
        Arrays.sort(numsArr, (a, b) -> {
            String stringa = ""+a;
            String stringb = ""+b;
            String sa = stringa + stringb, sb = stringb + stringa ;
            return sb.compareTo(sa);
        });


        //===判断对象等价，不是数值是否相等或定义对象，需要都修改
        if (numsArr[0] == 0) {
            return "0";
        }
        StringBuilder ret = new StringBuilder();
        for (int num : numsArr) {
            ret.append(num);
        }
        //测试
        return ret.toString();
    }
}
