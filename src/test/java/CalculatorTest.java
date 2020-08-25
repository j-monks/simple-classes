import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void addsTwoNumbers() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void subtractTwoNumbers() {
        assertEquals(4, calculator.subtract(8, 4));
    }

    @Test
    public void multiplyTwoNumbers() {
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void divideTwoNumbers() {
        assertEquals(2.5, calculator.divide(5, 2), 0.5);
    }
}
