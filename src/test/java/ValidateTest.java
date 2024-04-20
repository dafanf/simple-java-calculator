import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.example.*;

public class ValidateTest {
    @Test
    public void validateInvalidOperationAndValidOperand() {
        int operand1 = 1;
        int operand2 = 2;
        String operation = "%";
        boolean isValid = Validate.validateInput(operand1, operand2, operation);
        assertFalse("Invalid input. Please ensure your numbers are between -32768 and 32767 and the operator is one of +, -, *, /.", isValid);
    }

    @Test
    public void validateValidOperationAndOneInvalidOperand() {
        int operand1 = -32769;
        int operand2 = 2;
        String operation = "+";
        boolean isValid = Validate.validateInput(operand1, operand2, operation);
        assertFalse("Invalid input. Please ensure your numbers are between -32768 and 32767 and the operator is one of +, -, *, /.", isValid);
    }

    @Test
    public void validateValidOperationAndValidOperand() {
       int operand1 = 5;
        int operand2 = 3;
        String operation = "-";
        boolean isValid = Validate.validateInput(operand1, operand2, operation);
        assertTrue("Input should be valid", isValid);
    }
}
