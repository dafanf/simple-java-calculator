import com.example.Compute;
import com.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputeTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testComputeAdd() {
        int result = Compute.compute(calculator, 10, 5, "+");
        assertEquals(15, result);
    }

    @Test
    public void testComputeSubtract() {
        int result = Compute.compute(calculator, 10, 5, "-");
        assertEquals(5, result);
    }

    @Test
    public void testComputeMultiply() {
        int result = Compute.compute(calculator, 10, 5, "*");
        assertEquals(50, result);
    }

    @Test
    public void testComputeDivide() {
        int result = Compute.compute(calculator, 10, 5, "/");
        assertEquals(2, result);
    }

    @Test
    public void testComputeDivideByZero() {
        try {
            Compute.compute(calculator, 10, 0, "/");
        } catch (IllegalArgumentException e) {
            assertEquals("Cannot divide by zero!", e.getMessage());
        }
    }

    @Test
    public void testComputeInvalidOperation() {
        try {
            Compute.compute(calculator, 10, 5, "&");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid operation.", e.getMessage());
        }
    }
}
