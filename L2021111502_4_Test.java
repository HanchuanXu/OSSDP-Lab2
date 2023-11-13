import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * �����������ԭ�򣺵ȼ��໮��ԭ��
 * ��Ϊ����Ԫ��<2;һ�㣻�Ȳȫ��ȣ�������
 */
public class L2021111502_4_Test {

    /**
     * ����Ԫ��С��2
     */
    @Test public void test1(){
        Solution4 s =new Solution4();
        int[] nums={10};
        assertEquals(0,s.maximumGap(nums));

    }
    /**
     * һ�����
     */
    @Test public void test2(){
        Solution4 s =new Solution4();
        int[] nums={3, 6, 9, 1};
        assertEquals(3,s.maximumGap(nums));

    }
    /**
     * �Ȳ����
     */
    @Test public void test3(){
        Solution4 s =new Solution4();
        int[] nums={5, 10, 15, 20, 25, 30};
        assertEquals(5,s.maximumGap(nums));

    }
    /**
     * ȫ��Ȳ���
     */
    @Test public void test4(){
        Solution4 s =new Solution4();
        int[] nums={2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
        assertEquals(0,s.maximumGap(nums));

    }
    /**
     * ���������
     */
    @Test public void test5(){
        Solution4 s =new Solution4();
        int[] nums={1, 2, 3, 4, 5, 6, 7, 8, 100};
        assertEquals(92,s.maximumGap(nums));

    }
}