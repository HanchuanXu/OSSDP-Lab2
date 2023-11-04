import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest extends Solution {

    @Test
    public void findRepeatedDnaSequences() {
        String source1 = "AACCGGTTTTAACCGGTTTTAAGGCCTTAACCGG"; // AACCGGTTTT ACCGGTTTTA CCGGTTTTAA
        String source2 = "ACGTGTACATGACGATCATGGTTTTCAGTGGTACATGACGAT";//GTACATGACG TACATGACGA ACATGACGAT
        String source3 = "ATGCATGCATATGCATGCATGCATATGC"; //ATGCATGCAT TGCATGCATA GCATGCATAT CATGCATATG ATGCATATGC
        String source4 = "GATCGGTGATCGGTGATC";//GATCGGTGAT ATCGGTGATC

        Solution solution = new Solution();
        //System.out.println(solution.findRepeatedDnaSequences(source2));

        assertTrue(solution.findRepeatedDnaSequences(source1).size() == 3);
        assertTrue(solution.findRepeatedDnaSequences(source1).contains("AACCGGTTTT"));
        assertTrue(solution.findRepeatedDnaSequences(source1).contains("ACCGGTTTTA"));
        assertTrue(solution.findRepeatedDnaSequences(source1).contains("CCGGTTTTAA"));

        assertTrue(solution.findRepeatedDnaSequences(source2).size() == 3);
        assertTrue(solution.findRepeatedDnaSequences(source2).contains("GTACATGACG"));
        assertTrue(solution.findRepeatedDnaSequences(source2).contains("TACATGACGA"));
        assertTrue(solution.findRepeatedDnaSequences(source2).contains("ACATGACGAT"));

        assertTrue(solution.findRepeatedDnaSequences(source3).size() == 5);
        assertTrue(solution.findRepeatedDnaSequences(source3).contains("ATGCATGCAT"));
        ;
        assertTrue(solution.findRepeatedDnaSequences(source3).contains("TGCATGCATA"));
        ;
        assertTrue(solution.findRepeatedDnaSequences(source3).contains("GCATGCATAT"));
        ;
        assertTrue(solution.findRepeatedDnaSequences(source3).contains("CATGCATATG"));
        ;
        assertTrue(solution.findRepeatedDnaSequences(source3).contains("ATGCATATGC"));

        assertTrue(solution.findRepeatedDnaSequences(source4).size() == 2);
        assertTrue(solution.findRepeatedDnaSequences(source4).contains("GATCGGTGAT"));
        assertTrue(solution.findRepeatedDnaSequences(source4).contains("ATCGGTGATC"));
    }
}