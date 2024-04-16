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

            if (!Validate.validateInput(operand1, operand2, operation)) {
                System.out.println(
                        "Invalid input. Please ensure your numbers are between -32768 and 32767 and the operator is one of +, -, *, /.");
                return;
            }

            Calculator calculator = new Calculator();
            int result = Compute.compute(calculator, operand1, operand2, operation);

            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
