import static org.junit.Assert.assertEquals;
import org.junit.Test;
import com.example.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        int operand1 = 20;
        int operand2 = 10;
        Calculator calculator = new Calculator();
        assertEquals(30, calculator.add(operand1, operand2));
    }

    @Test
    public void testSubtract() {
        int operand1 = 20;
        int operand2 = 10;
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.subtract(operand1, operand2));
    }

    @Test
    public void testMultiply() {
        int operand1 = 20;
        int operand2 = 10;
        Calculator calculator = new Calculator();
        assertEquals(200, calculator.multiply(operand1, operand2));
    }

    @Test
    public void testDivide() {
        int operand1 = 20;
        int operand2 = 10;
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(operand1, operand2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        int operand1 = 10;
        int operand2 = 0;
        Calculator calculator = new Calculator();
        calculator.divide(operand1, operand2);
    }

    @Test
    public void testDivideFail() { // Untuk melihat hasil incident report yang di generate
        int operand1 = 20;
        int operand2 = 10;
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.divide(operand1, operand2));
    }
}