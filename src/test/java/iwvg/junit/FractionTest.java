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
    void testDecimal() {
        assertEquals(2, fraction.decimal());
    }

    @Test
    void testFraction() {
        fraction = new Fraction();
        assertEquals(1, fraction.getDenominator());
        assertEquals(1, fraction.getNumerator());
    }

    @Test
    void testFractionInt() {
        assertEquals(2, fraction.getDenominator());
        assertEquals(4, fraction.getNumerator());
    }

    @Test
    void testIsEquivalente() {
        fraction = new Fraction(2,4);
        Fraction otherFraction = new Fraction(3,6);
        assertEquals(true,fraction.isEquivalente(otherFraction));
    }

    @Test
    void testIsNotEquivalente() {
        fraction = new Fraction(2,5);
        Fraction otherFraction = new Fraction(3,6);
        assertEquals(false,fraction.isEquivalente(otherFraction));
    }

    @Test
    void testIsPropia(){
        assertEquals(false, fraction.isPropia());
    }

}
