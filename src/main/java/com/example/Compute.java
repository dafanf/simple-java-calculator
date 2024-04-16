package com.example;

public class Compute {
    public static int compute(Calculator calculator, int operand1, int operand2, String operation) {
        switch (operation) {
            case "+":
                return calculator.add(operand1, operand2);
            case "-":
                return calculator.subtract(operand1, operand2);
            case "*":
                return calculator.multiply(operand1, operand2);
            case "/":
                if (operand2 == 0)
                    throw new IllegalArgumentException("Cannot divide by zero!");
                return calculator.divide(operand1, operand2);
            default:
                throw new IllegalArgumentException("Invalid operation.");
        }
    }
}
