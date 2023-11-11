import org.junit.*;
import static org.junit.Assert.*;

import java.util.List;

public class L2021112995_17_Test {
    /*
    Test Strategy
    等价类划分的原则：
    输入集：
    空字符串、输出结果为0个的DNA序列、结果为1个的DNA序列、结果为多个的DNA序列
    输出结果为0个的DNA序列：
    input："ACGAATTCCGAC"
    output:[]
    结果为1个的DNA序列:
    input:"ACGAATTACGAATTACGTG"
    output:["ACGAATTACG"]
    结果为多个的DNA序列:
    input:"AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
    output:["AAAAACCCCC","CCCCCAAAAA"]
    */
    @Test
    public void testSolution17(){
        Solution17 test = new Solution17();

        List<String> res0 = test.findRepeatedDnaSequences("");
        assertEquals(0,res0.size());

        List<String> res1 = test.findRepeatedDnaSequences("ACGAATTCCGAC");
        assertEquals(0,res1.size());

        List<String> res2 = test.findRepeatedDnaSequences("ACGAATTACGAATTACGTG");
        assertEquals(1,res2.size());
        assertTrue(res2.contains("ACGAATTACG"));

        List<String> res3 = test.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT");
        assertTrue(res3.contains("AAAAACCCCC"));
        assertTrue(res3.contains("CCCCCAAAAA"));
        assertEquals(2,res3.size());
    }


}
