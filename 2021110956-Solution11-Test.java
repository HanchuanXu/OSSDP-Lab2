import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void threeSum() {
        List<List<Integer>>ans = new ArrayList<List<Integer>>();
        List<Integer>t = new ArrayList<Integer>();
        t.add(0);
        t.add(0);
        t.add(0);
        ans.add(t);
        int[]arr = {0,0,0};
        assertEquals(ans,new Solution().threeSum(arr));
        //{1,2,3}->[]
        ans.clear();
        t.clear();
        int[]arr1 = {1,2,3};
        assertEquals(ans,new Solution().threeSum(arr1));
        //{-1,0,1,2,-1,-4} -> [[-1,-1,2],[-1,0,1]]
        t.add(-1);
        t.add(-1);
        t.add(2);
        ans.add(new ArrayList<Integer>(t));
        t.clear();
        t.add(-1);
        t.add(0);
        t.add(1);
        ans.add(new ArrayList<Integer>(t));
        int[] arr2 = {-1,0,1,2,-1,-4};
        assertEquals(ans,new Solution().threeSum(arr2));
    }
}