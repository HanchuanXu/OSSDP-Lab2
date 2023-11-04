import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class L2021112132_Solution6_Test {
    @Test
    public void testSolution6_1(){
        Solution6 solution6 = new Solution6();
        List <List<String>> favoriteCompanies = new ArrayList<>();
        List <String> first = new ArrayList<>(Arrays.asList("leetcode","google","facebook"));
        List <String> second = new ArrayList<>(Arrays.asList("google","microsoft"));
        List <String> third = new ArrayList<>(Arrays.asList("google","facebook"));
        List <String> forth = new ArrayList<>(Arrays.asList("google"));
        List <String> fifth = new ArrayList<>(Arrays.asList("amazon"));
        favoriteCompanies.add(first);
        favoriteCompanies.add(second);
        favoriteCompanies.add(third);
        favoriteCompanies.add(forth);
        favoriteCompanies.add(fifth);
        List<Integer> result = new ArrayList<>(Arrays.asList(0,1,4));
        assertEquals(result,solution6.peopleIndexes(favoriteCompanies));
    }

    @Test
    public void testSolution6_2(){
        Solution6 solution6 = new Solution6();
        List <List<String>> favoriteCompanies = new ArrayList<>();
        List <String> first = new ArrayList<>(Arrays.asList("leetcode","google","facebook"));
        List <String> second = new ArrayList<>(Arrays.asList("leetcode","amazon"));
        List <String> third = new ArrayList<>(Arrays.asList("facebook","google"));
        favoriteCompanies.add(first);
        favoriteCompanies.add(second);
        favoriteCompanies.add(third);
        List<Integer> result = new ArrayList<>(Arrays.asList(0,1));
        assertEquals(result,solution6.peopleIndexes(favoriteCompanies));
    }

    @Test
    public void testSolution6_3(){
        Solution6 solution6 = new Solution6();
        List <List<String>> favoriteCompanies = new ArrayList<>();
        List <String> first = new ArrayList<>(Arrays.asList("leetcode"));
        List <String> second = new ArrayList<>(Arrays.asList("google"));
        List <String> third = new ArrayList<>(Arrays.asList("facebook"));
        List <String> forth = new ArrayList<>(Arrays.asList("amazon"));
        favoriteCompanies.add(first);
        favoriteCompanies.add(second);
        favoriteCompanies.add(third);
        favoriteCompanies.add(forth);
        List<Integer> result = new ArrayList<>(Arrays.asList(0,1,2,3));
        assertEquals(result,solution6.peopleIndexes(favoriteCompanies));
    }
}
