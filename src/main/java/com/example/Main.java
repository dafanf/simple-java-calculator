package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple Calculator!");

        try {
            System.out.print("Enter the first number: ");
            int operand1 = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int operand2 = scanner.nextInt();

            System.out.print("Choose an operation (+, -, *, /): ");
            String operation = scanner.next();

            if (!validateInput(operand1, operand2, operation)) {
                System.out.println("Invalid input. Please ensure your numbers are between -32768 and 32767 and the operator is one of +, -, *, /.");
                return;
            }

            Calculator calculator = new Calculator();
            int result = compute(calculator, operand1, operand2, operation);

            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static boolean validateInput(int operand1, int operand2, String operation) {
        if (!operation.matches("[+\\-*/]")) return false;
        if (operand1 < -32768 || operand1 > 32767 || operand2 < -32768 || operand2 > 32767) return false;
        return true;
    }

    private static int compute(Calculator calculator, int operand1, int operand2, String operation) {
        switch (operation) {
            case "+":
                return calculator.add(operand1, operand2);
            case "-":
                return calculator.subtract(operand1, operand2);
            case "*":
                return calculator.multiply(operand1, operand2);
            case "/":
                if (operand2 == 0) throw new IllegalArgumentException("Cannot divide by zero!");
                return calculator.divide(operand1, operand2);
            default:
                throw new IllegalArgumentException("Invalid operation.");
        }
    }
}
