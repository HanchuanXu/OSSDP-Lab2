import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Test6 {
    @Test
    public void Test(){
        Solution6 solution6 = new Solution6();
        List<String> f1 = Arrays.asList("leetcode","google","facebook");
        List<String> f2 = Arrays.asList("google","microsoft");
        List<String> f3 = Arrays.asList("google","facebook");
        List<String> f4 = Arrays.asList("google");
        List<String> f5 = Arrays.asList("amazon");
        List<List<String>> favoriteCompanies = Arrays.asList(f1,f2,f3,f4,f5);
        List<Integer> rightAnswer = new ArrayList<Integer>();
        rightAnswer.add(0);
        rightAnswer.add(1);
        rightAnswer.add(4);
        Assert.assertEquals(solution6.peopleIndexes(favoriteCompanies),rightAnswer);
    }
}
