import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertLinesMatch;

import java.beans.Transient;
import java.util.*;

import org.junit.Test;

public class L2021113669_X_Test extends Solution20
{
    @Test
    public void testfindMinHeightTrees()
    {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        assertEquals(a, findMinHeightTrees(4, new int[][]{{1,0},{1,2},{1,3}})); 
          
    }   
}