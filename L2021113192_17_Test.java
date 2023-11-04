import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class L2021113192_17_Test {
    /*
    划分等价类：
    依据字符串长度为0，长度大于0小于10，长度大于10且有重复，长度大于0且无重复
     */
    @Test
    public void testfindRepeatedDnaSequences(){
        Solution17 test = new Solution17();

        //字符串长度等于0
        String a ="";
        assertTrue(test.findRepeatedDnaSequences(a).size()==0);

        //字符串长度大于0小于10
        String b="AAC";
        assertTrue(test.findRepeatedDnaSequences(b).size()==0);

        //字符串长度大于10且无重复
        String d="AAACTGGATGCCA";
        assertTrue(test.findRepeatedDnaSequences(d).size()==0);

        //字符串长度大于10且有重复
        String c="AAAAAAAAAAAAA";
        assertTrue(test.findRepeatedDnaSequences(c).contains("AAAAAAAAAA"));

        String e="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        assertTrue(test.findRepeatedDnaSequences(e).contains("AAAAACCCCC"));
        assertTrue(test.findRepeatedDnaSequences(e).contains("CCCCCAAAAA"));

        String f="AACCGGTTTTAACCGGTTTTAAGGCCTTAACCGG";
        assertTrue(test.findRepeatedDnaSequences(f).contains("AACCGGTTTT"));
        assertTrue(test.findRepeatedDnaSequences(f).contains("ACCGGTTTTA"));
        assertTrue(test.findRepeatedDnaSequences(f).contains("CCGGTTTTAA"));
    }
}
