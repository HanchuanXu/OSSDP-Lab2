import org.junit.Test;

import static org.junit.Assert.*;

public class L2021113444_Solution_Test {
    /**
     * 等价类划分原则：不喜欢关系为树，不喜欢关系为环
     */
    Solution9 solution9 = new Solution9();
    //用例1
    int n1 = 4;
    int[][] dislikes1 = {{1,2},{1,3},{2,4}};
    //用例2
    int n2 = 3;
    int[][] dislikes2 = {{1,2},{1,3},{2,3}};
    //用例3
    int n3 = 5;
    int[][] dislikes3 = {{1,2},{2,3},{3,4},{4,5},{1,5}};

    /**
     * 测试目的：测试possibleBipartition是否能正确检测出 能否进行分组
     * 测试用例：用例1，用例2，用例3
     */
    @Test
    public void possibleBipartition() {
        assert solution9.possibleBipartition(n1,dislikes1) == true;
        assert solution9.possibleBipartition(n2,dislikes2) == false;
        assert solution9.possibleBipartition(n3,dislikes3) == false;
    }

    /**
     * 等价类划分原则：两个节点在同一并查集内，两个节点不在同一并查集内
     */
    //用例1
    int [] fa1 = {-1,-1,1,2,3,-1,5};
    //用例2
    int [] fa2 = {-1,3,1,-1,2,4,-1};
    /**
     * 测试目的：测试unit是否能将两个节点置入一个并查集
     */
    @Test
    public void unit() {
        solution9.unit(4,6,fa1);
        solution9.unit(1,5,fa2);
        assert fa1[6] == 5;
        assert fa2[6] == -1;
    }
    /**
     * 等价类划分原则：两个节点在同一并查集内，两个节点不在同一并查集内
     */
    //用例1
    int [] fa3 = {-1,-1,1,2,3,-1,5};
    //用例2
    int [] fa4 = {-1,3,1,-1,2,4,-1};
    /**
     * 测试目的：测试isconnect是否能检测两个节点是否在一个并查集
     */
    @Test
    public void isconnect() {
        assert !solution9.isconnect(4,6,fa3);
        assert solution9.isconnect(1,5,fa4);
    }
    //用例1
    int [] fa5 = {-1,-1,1,2,3,-1,5};
    /**
     * 测试目的：测试findFa是否能梳理两个节点的父节点
     */
    @Test
    public void findFa() {
        boolean a = true;
        solution9.findFa(4,fa5);
        int [] answer = {-1,-1,1,1,1,-1,5};
        for(int i =0;i<fa5.length;i++){
            if(fa5[i]!=answer[i]){
                a = false;
            }
        }
        assert a;
    }
}