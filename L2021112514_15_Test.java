import org.junit.Test;
import static org.junit.Assert.*;

public class TestOSSDP {
    @Test
    public void test1(){
        Solution solution = new Solution();
        assertEquals(0,solution.compareVersion("1.01","1.001"));
        assertEquals(0,solution.compareVersion("1.0","1.0.0"));
        assertEquals(-1,solution.compareVersion("0.1","1.1"));
        assertEquals(-1,solution.compareVersion("1.0.0.1","1.0.1"));
        assertEquals(1,solution.compareVersion("1.1","0.1"));
        assertEquals(1,solution.compareVersion("1.0.1","1.0.0.1"));
    }
}
