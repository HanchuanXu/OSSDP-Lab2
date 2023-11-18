import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class L2022120069_20_Test {
    // Testing strategy for Edge
    /*
     *  @testSolution20
     *  根据最远节点寻找最小高度树
     *  等价类划分： 1.节点数为1  2.节点数>1且最小高度数仅有1个   3.节点数>1且最小高度数>1个
     *
     */

    @Test
    public void testSolution20() {
        Solution20 solution = new Solution20();
        int[][] edges1 = {{}};
        int[][] edges2 = {{1,0},{1,2},{1,3}};
        int[][] edges3 = {{3,0},{3,1},{3,2},{3,4},{5,4}};
        List<Integer> ans1 = new ArrayList<Integer>(){{add(0);}};
        List<Integer> ans2 = new ArrayList<Integer>(){{add(1);}};
        List<Integer> ans3 = new ArrayList<Integer>(){{add(3);add(4);}};
        assertEquals(ans1,solution.findMinHeightTrees(1,edges1));
        assertEquals(ans2,solution.findMinHeightTrees(4,edges2));
        assertEquals(ans3,solution.findMinHeightTrees(6,edges3));
    }
}