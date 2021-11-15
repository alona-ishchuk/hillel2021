import org.testng.annotations.Test;

import java.util.Currency;

import static org.testng.Assert.*;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testSum() {
        assertEquals(calc.sum(20,5), 25);
    }

    @Test
    public void testMultiply() {
        assertEquals(calc.multiply(20,5), 100);
    }

    @Test
    public void testMinus() {
        assertEquals(calc.minus(20,5), 15);
    }

    @Test
    public void testDivide() {
        assertEquals(calc.divide(20,5), 4);
    }
}