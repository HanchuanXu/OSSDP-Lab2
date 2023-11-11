import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for Solution1.
 * @author 2021110688
 * @since 1.0
 */
class L2021110688_1_Test {

    // Test strategy:
    // Partition the inputs as follows:
    //   numerator: positive, negative, 0
    //   dominator: positive, negative
    //   result: finite decimal, infinite decimal, integer

    /**
     * Instance for Solution1.
     */
    private final Solution1 solution = new Solution1();

    // covers: positive numerator, positive dominator, integer result
    @Test
    void fractionToDecimalPositiveDividePositiveWithIntegerResult() {
        assertEquals("2", solution.fractionToDecimal(8, 4));
        assertEquals("9", solution.fractionToDecimal(9, 1));
        assertEquals("1", solution.fractionToDecimal(6, 6));
    }

    // covers: positive numerator, negative dominator, integer result
    @Test
    void fractionToDecimalPositiveDivideNegativeWithIntegerResult() {
        assertEquals("-2", solution.fractionToDecimal(8, -4));
        assertEquals("-9", solution.fractionToDecimal(9, -1));
        assertEquals("-1", solution.fractionToDecimal(6, -6));
    }

    // covers: negative numerator, positive dominator, integer result
    @Test
    void fractionToDecimalNegativeDividePositiveWithIntegerResult() {
        assertEquals("-2", solution.fractionToDecimal(-8, 4));
        assertEquals("-9", solution.fractionToDecimal(-9, 1));
        assertEquals("-1", solution.fractionToDecimal(-6, 6));
    }

    // covers: negative numerator, negative dominator, integer result
    @Test
    void fractionToDecimalNegativeDivideNegativeWithIntegerResult() {
        assertEquals("2", solution.fractionToDecimal(-8, -4));
        assertEquals("9", solution.fractionToDecimal(-9, -1));
        assertEquals("1", solution.fractionToDecimal(-6, -6));
    }

    // covers: zero numerator, positive dominator
    @Test
    void fractionToDecimalZeroDividePositive() {
        assertEquals("0", solution.fractionToDecimal(0, 1));
        assertEquals("0", solution.fractionToDecimal(0, 64));
        assertEquals("0", solution.fractionToDecimal(0, 102));
    }

    // covers: zero numerator, negative dominator
    @Test
    void fractionToDecimalZeroDivideNegative() {
        assertEquals("0", solution.fractionToDecimal(0, -1));
        assertEquals("0", solution.fractionToDecimal(0, -64));
        assertEquals("0", solution.fractionToDecimal(0, -102));
    }

    // covers: positive numerator, positive dominator, finite decimal result
    @Test
    void fractionToDecimalPositiveDividePositiveWithFiniteResult() {
        assertEquals("0.5", solution.fractionToDecimal(1, 2));
        assertEquals("0.375", solution.fractionToDecimal(3, 8));
        assertEquals("1.029296875", solution.fractionToDecimal(527, 512));
    }

    // covers: positive numerator, negative dominator, finite decimal result
    @Test
    void fractionToDecimalPositiveDivideNegativeWithFiniteResult() {
        assertEquals("-0.5", solution.fractionToDecimal(1, -2));
        assertEquals("-0.375", solution.fractionToDecimal(3, -8));
        assertEquals("-1.029296875", solution.fractionToDecimal(527, -512));
    }

    // covers: negative numerator, positive dominator, finite decimal result
    @Test
    void fractionToDecimalNegativeDividePositiveWithFiniteResult() {
        assertEquals("-0.5", solution.fractionToDecimal(-1, 2));
        assertEquals("-0.375", solution.fractionToDecimal(-3, 8));
        assertEquals("-1.029296875", solution.fractionToDecimal(-527, 512));
    }

    // covers: negative numerator, negative dominator, finite decimal result
    @Test
    void fractionToDecimalNegativeDivideNegativeWithFiniteResult() {
        assertEquals("0.5", solution.fractionToDecimal(-1, -2));
        assertEquals("0.375", solution.fractionToDecimal(-3, -8));
        assertEquals("1.029296875", solution.fractionToDecimal(-527, -512));
    }

    // covers: positive numerator, positive dominator, infinite decimal result
    @Test
    void fractionToDecimalPositiveDividePositiveWithInfiniteResult() {
        assertEquals("0.(3)", solution.fractionToDecimal(1, 3));
        assertEquals("1.0(6)", solution.fractionToDecimal(16, 15));
        assertEquals("0.(0434782608695652173913)", solution.fractionToDecimal(1, 23));
    }

    // covers: positive numerator, negative dominator, infinite decimal result
    @Test
    void fractionToDecimalPositiveDivideNegativeWithInfiniteResult() {
        assertEquals("-0.(3)", solution.fractionToDecimal(1, -3));
        assertEquals("-1.0(6)", solution.fractionToDecimal(16, -15));
        assertEquals("-0.(0434782608695652173913)", solution.fractionToDecimal(1, -23));
    }

    // covers: negative numerator, positive dominator, infinite decimal result
    @Test
    void fractionToDecimalNegativeDividePositiveWithInfiniteResult() {
        assertEquals("-0.(3)", solution.fractionToDecimal(-1, 3));
        assertEquals("-1.0(6)", solution.fractionToDecimal(-16, 15));
        assertEquals("-0.(0434782608695652173913)", solution.fractionToDecimal(-1, 23));
    }

    // covers: negative numerator, negative dominator, infinite decimal result
    @Test
    void fractionToDecimalNegativeDivideNegativeWithInfiniteResult() {
        assertEquals("0.(3)", solution.fractionToDecimal(-1, -3));
        assertEquals("1.0(6)", solution.fractionToDecimal(16, 15));
        assertEquals("0.(0434782608695652173913)", solution.fractionToDecimal(-1, -23));
    }
}