import org.junit.jupiter.api.Test;

class L2021110403_10_Test {

    @Test
    void fractionAddition() {
        //使用assertion
        assert new Solution10().fractionAddition("-1/2+1/2").equals("0/1");
        assert new Solution10().fractionAddition("-1/2+1/2+1/3").equals("1/3");
        assert new Solution10().fractionAddition("1/3-1/2").equals("-1/6");

    }

    @Test
    void gcd() {
        //使用assertion
        assert new Solution10().gcd(1, 2) == 1;
        assert new Solution10().gcd(2, 4) == 2;
        assert new Solution10().gcd(4, 2) == 2;
        assert new Solution10().gcd(2, 3) == 1;
        assert new Solution10().gcd(3, 2) == 1;
    }
}