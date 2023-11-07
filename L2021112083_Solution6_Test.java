

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class L2021112083_Solution6_Test {
    /**
    * 示例 1 : 通常情况
    * 输入：favoriteCompanies = [["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
    * 输出：[0,1,4]
    * */
    @Test
    public void peopleIndexes1() {
        Solution6 solution6=new Solution6();
        List<List<String>> favoriteCompanies=new ArrayList<>();
        /*[["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
        favoriteCompanies = [["leetcode","google","facebook"],["leetcode","amazon"],["facebook","google"]]
        favoriteCompanies = [["leetcode"],["google"],["facebook"],["amazon"]]*/
        List<String> list0=new ArrayList<>();
        list0.add("leetcode");list0.add("google");list0.add("facebook");
        List<String> list1=new ArrayList<>();
        list1.add("google");list1.add("microsoft");
        List<String> list2=new ArrayList<>();
        list2.add("google");list2.add("facebook");
        List<String> list3=new ArrayList<>();
        list3.add("google");
        List<String> list4=new ArrayList<>();
        list4.add("amazon");
        favoriteCompanies.add(list0);
        favoriteCompanies.add(list1);
        favoriteCompanies.add(list2);
        favoriteCompanies.add(list3);
        favoriteCompanies.add(list4);
        List<Integer> ans = solution6.peopleIndexes(favoriteCompanies);
        List<Integer> realans = new ArrayList<>();
        realans.add(0); realans.add(1); realans.add(4);
        assert (ans.equals(realans) == true);
        //System.out.println(ans);
    }
    /**
     * 示例 2：有子集但顺序略有不同
     * 输入：favoriteCompanies = [["leetcode","google","facebook"],["leetcode","amazon"],["facebook","google"]]
    * 输出：[0,1]
     * */
    @Test
    public void peopleIndexes2() {
        Solution6 solution6=new Solution6();
        List<List<String>> favoriteCompanies=new ArrayList<>();
        //["leetcode","google","facebook"],["leetcode","amazon"],["facebook","google"]
        List<String> list0=new ArrayList<>();
        list0.add("leetcode");list0.add("google");list0.add("facebook");
        List<String> list1=new ArrayList<>();
        list1.add("leetcode");list1.add("amazon");
        List<String> list2=new ArrayList<>();
        list2.add("facebook");list2.add("google");
        favoriteCompanies.add(list0);
        favoriteCompanies.add(list1);
        favoriteCompanies.add(list2);
        List<Integer> ans = solution6.peopleIndexes(favoriteCompanies);
        List<Integer> realans = new ArrayList<>();
        realans.add(0); realans.add(1);
        assert (ans.equals(realans) == true);
        //System.out.println(ans);
    }
    /**
    * 示例 3：都不相同
    * 输入：favoriteCompanies = [["leetcode"],["google"],["facebook"],["amazon"]]
    * 输出：[0,1,2,3]
    * */
    @Test
    public void peopleIndexes3() {
        Solution6 solution6=new Solution6();
        List<List<String>> favoriteCompanies=new ArrayList<>();
        //["leetcode"],["google"],["facebook"],["amazon"]
        List<String> list0=new ArrayList<>();
        list0.add("leetcode");
        List<String> list1=new ArrayList<>();
        list1.add("google");
        List<String> list2=new ArrayList<>();
        list2.add("facebook");
        List<String> list3=new ArrayList<>();
        list3.add("amazon");
        favoriteCompanies.add(list0);
        favoriteCompanies.add(list1);
        favoriteCompanies.add(list2);
        favoriteCompanies.add(list3);
        List<Integer> ans = solution6.peopleIndexes(favoriteCompanies);
        List<Integer> realans = new ArrayList<>();
        realans.add(0); realans.add(1); realans.add(2);realans.add(3);
        assert (ans.equals(realans) == true);
        //System.out.println(ans);
    }
    /**
     * 示例 4：favoriteCompanies为空
     * 输入：favoriteCompanies = []
     * 输出：[]
     * */
    @Test
    public void peopleIndexes4() {
        Solution6 solution6=new Solution6();
        List<List<String>> favoriteCompanies=new ArrayList<>();
        //["leetcode"],["google"],["facebook"],["amazon"]
        List<Integer> ans = solution6.peopleIndexes(favoriteCompanies);
        List<Integer> realans = new ArrayList<>();
        assert (ans.equals(realans) == true);
        //System.out.println(ans);
    }
    /**
     * 示例 5：全部相同
     * 输入：favoriteCompanies = [["google"],["google"],["google"],["google"]]
     * 输出：[]
     * */
    @Test
    public void peopleIndexes5() {
        Solution6 solution6=new Solution6();
        List<List<String>> favoriteCompanies=new ArrayList<>();
        //["google"],["google"],["google"],["google"]
        List<String> list0=new ArrayList<>();
        list0.add("google");
        List<String> list1=new ArrayList<>();
        list1.add("google");
        List<String> list2=new ArrayList<>();
        list2.add("google");
        List<String> list3=new ArrayList<>();
        list3.add("google");
        favoriteCompanies.add(list0);
        favoriteCompanies.add(list1);
        favoriteCompanies.add(list2);
        favoriteCompanies.add(list3);
        List<Integer> ans = solution6.peopleIndexes(favoriteCompanies);
        List<Integer> realans = new ArrayList<>();
        assert (ans.equals(realans) == true);
        //System.out.println(ans);
    }
}