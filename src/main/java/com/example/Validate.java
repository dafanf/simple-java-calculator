package com.example;

public class Validate {
    public static boolean validateInput(int operand1, int operand2, String operation) {
        if (!operation.matches("[+\\-*/]"))
            return false;
        if (operand1 < -32768 || operand1 > 32767 || operand2 < -32768 || operand2 > 32767)
            return false;
        return true;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }
}
