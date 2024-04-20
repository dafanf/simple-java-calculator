import com.example.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ValidateInputTest {
    @Test
    public void testValidateInput_InvalidOperandsAndOperator() {
        int operand1 = 32770;
        int operand2 = -32769;
        String operation = "%";

        // Test untuk memastikan bahwa validasi input mengembalikan `false`
        // karena operand1 dan operand2 berada di luar range valid dan operation tidak
        // valid
        boolean isValid = Validate.validateInput(operand1, operand2, operation);
        assertFalse(
                "Invalid input. Please ensure your numbers are between -32768 and 32767 and the operator is one of +, -, *, /.",
                isValid);
    }

    @Test
    public void testValidateInput_InvalidOperandsValidOperator() {
        int operand1 = 32770;
        int operand2 = -32769;
        String operation = "+";

        // Test untuk memastikan bahwa validasi input mengembalikan `false`
        // karena operand1 dan operand2 berada di luar range valid, meskipun operation
        // valid
        boolean isValid = Validate.validateInput(operand1, operand2, operation);
        assertFalse(
                "Invalid input. Please ensure your numbers are between -32768 and 32767 and the operator is one of +, -, *, /.",
                isValid);
    }

    @Test
    public void testValidateInput_ValidAndInvalidOperandWithValidOperator() {
        int operand1 = 10;
        int operand2 = -32769; // Ini di luar rentang integer yang diijinkan (-32768 hingga 32767)
        String operation = "-"; // Operator pengurangan yang valid

        // Test untuk memastikan bahwa validasi input mengembalikan `false`
        // karena operand2 berada di luar range valid meskipun operator valid
        boolean isValid = Validate.validateInput(operand1, operand2, operation);
        assertFalse(
                "Invalid input. Please ensure your numbers are between -32768 and 32767 and the operator is one of +, -, *, /.",
                isValid);
    }

    @Test
    public void testValidateInput_InvalidOperandAndInvalidOperator() {
        int operand1 = 10;
        int operand2 = -32769; // di luar rentang integer yang diizinkan
        String operation = "%"; // operator tidak valid

        // Memastikan bahwa validasi input mengembalikan `false`
        // karena operand2 berada di luar rentang valid dan operator tidak valid
        boolean isValid = Validate.validateInput(operand1, operand2, operation);
        assertFalse(
                "Invalid input. Please ensure your numbers are between -32768 and 32767 and the operator is one of +, -, *, /.",
                isValid);
    }

    @Test
    public void testValidateInput_ValidOperandsAndInvalidOperator() {
        int operand1 = 10;
        int operand2 = 5;
        String operation = "%"; // operator tidak valid

        // Memastikan bahwa validasi input mengembalikan `true`
        // karena operand1, operand2, dan operator semuanya valid
        boolean isValid = Validate.validateInput(operand1, operand2, operation);
        assertFalse(
                "Invalid input. Please ensure your numbers are between -32768 and 32767 and the operator is one of +, -, *, /.",
                isValid);
    }

    @Test
    public void testValidateInput_ValidOperandsAndValidOperator() {
        int operand1 = 10;
        int operand2 = 5;
        String operation = "+"; // operator valid

        // Memastikan bahwa validasi input mengembalikan `true`
        // karena operand1, operand2, dan operator semuanya valid
        boolean isValid = Validate.validateInput(operand1, operand2, operation);
        assertTrue("Input should be valid", isValid);
    }
}
