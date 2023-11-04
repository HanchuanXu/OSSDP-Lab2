import junit.framework.TestCase;
import org.junit.Test;
import solution.Solution9;
public class L2021113359_Solution9_Test extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }
    @Test
    public void testSoulution9(){
        Solution9 s9=new Solution9();
        int[][] dislikes1=new int[3][2];
        dislikes1[0]= new int[]{1, 2};
        dislikes1[1]= new int[]{1, 3};
        dislikes1[2]=new int[]{2,4};

        int[][] dislikes2=new int[5][2];
        dislikes2[0]=new int[]{1,2};
        dislikes2[1]=new int[]{2,3};
        dislikes2[2]=new int[]{3,4};
        dislikes2[3]=new int[]{4,5};
       dislikes2[4]=new int[]{1,5};
        assertTrue(s9.possibleBipartition(4,dislikes1));
        assertFalse(s9.possibleBipartition(5,dislikes2));
    }
}