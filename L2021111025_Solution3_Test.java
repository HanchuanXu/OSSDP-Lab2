import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class L2021111025_Solution3_Test {

    @org.junit.jupiter.api.Test
    void largestDivisibleSubset() {
        int[] arr=new int[]{1,2,4};
        Solution3 test= new Solution3();
        List<Integer> ans=test.largestDivisibleSubset(arr);
        assertEquals(ans.size(),3);
        assertEquals(ans.get(0),1);
        assertEquals(ans.get(1),2);
        assertEquals(ans.get(2),4);

        int[] arr2=new int[]{3,5,8,2,9,4,7,1,10,6};
        ans=test.largestDivisibleSubset(arr2);
        assertEquals(ans.size(),4);
        assertEquals(ans.get(0),1);
        assertEquals(ans.get(1),2);
        assertEquals(ans.get(2),4);
        assertEquals(ans.get(3),8);
    }
}