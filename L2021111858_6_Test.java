import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class L2021111858_6_Test {

    /**
     * 测试目的是测试修改bug后的solution6能否通过三个示例
     * 测试用例采用的是代码中给定的三个示例
     */
    @Test
    public void peopleIndexes() {
        Solution6 sol = new Solution6();
        List<List<String>> favoriteCompanies1 = new ArrayList<List<String>>();
        List<List<String>> favoriteCompanies2 = new ArrayList<List<String>>();
        List<List<String>> favoriteCompanies3 = new ArrayList<List<String>>();

        //示例1
        favoriteCompanies1.add(Arrays.asList("leetcode","google","facebook"));
        favoriteCompanies1.add(Arrays.asList("google","microsoft"));
        favoriteCompanies1.add(Arrays.asList("google","facebook"));
        favoriteCompanies1.add(Arrays.asList("google"));
        favoriteCompanies1.add(Arrays.asList("amazon"));
        List<Integer> ans = new ArrayList<Integer>();
        ans = sol.peopleIndexes(favoriteCompanies1);
        assertEquals(ans,Arrays.asList(0,1,4));

        //示例2
        favoriteCompanies2.add(Arrays.asList("leetcode","google","facebook"));
        favoriteCompanies2.add(Arrays.asList("leetcode","amazon"));
        favoriteCompanies2.add(Arrays.asList("facebook","google"));
        ans = sol.peopleIndexes(favoriteCompanies2);
        assertEquals(ans,Arrays.asList(0,1));

        //示例3
        favoriteCompanies3.add(Arrays.asList("leetcode"));
        favoriteCompanies3.add(Arrays.asList("google"));
        favoriteCompanies3.add(Arrays.asList("facebook"));
        favoriteCompanies3.add(Arrays.asList("amazon"));
        ans = sol.peopleIndexes(favoriteCompanies3);
        assertEquals(ans,Arrays.asList(0,1,2,3));
    }
}