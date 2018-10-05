package iwvg.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {
    private Fraction fraction;

    @BeforeEach
    void before() {
        fraction = new Fraction(4, 2);
    }

    @Test
    void TestDecimal() {
        assertEquals(2, fraction.decimal());
    }

    @Test
    void TestFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getDenominator());
        assertEquals(1, fraction.getNumerator());
    }

    @Test
    void TestFractionInt() {
        assertEquals(2, fraction.getDenominator());
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    void TestIsEquivalente() {
        fraction = new Fraction(2,4);
        Fraction otherFraction = new Fraction(3,6);
        assertEquals(true,fraction.isEquivalente(otherFraction));
    }

    @Test
    void TestIsNotEquivalente() {
        fraction = new Fraction(2,5);
        Fraction otherFraction = new Fraction(3,6);
        assertEquals(false,fraction.isEquivalente(otherFraction));
    }

}
