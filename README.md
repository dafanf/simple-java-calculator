# Simple Calculator Project

This project is a simple implementation of a calculator in Java. It allows users to perform basic arithmetic operations such as addition, subtraction, multiplication, and division on two integers.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Usage](#usage)
- [Testing](#testing)

## Overview

The calculator project consists of several Java classes:

- **Calculator**: Contains methods for performing arithmetic operations (addition, subtraction, multiplication, division).
- **Compute**: Provides a method for computing arithmetic operations based on user input.
- **Main**: The main class where the calculator application is executed. It takes user input and utilizes the `Calculator` and `Compute` classes to perform calculations.
- **Validate**: Contains a method for validating user input to ensure that operands are within a valid range and the operation is valid.
- **CalculatorTest**: JUnit test cases for testing the functionality of the `Calculator` class.
- **ComputeTest**: JUnit test cases for testing the functionality of the `Compute` class.
- **ValidateInputTest**: JUnit test cases for testing the input validation functionality in the `Validate` class.
- **ValidateTest**: Additional JUnit test cases for testing input validation.

## Features

- Perform addition, subtraction, multiplication, and division operations.
- Input validation to ensure operands are within a valid range and the operation is valid.
- Exception handling for division by zero.

## Usage

To use the calculator, run the `Main` class. Follow the on-screen instructions to enter two integers and choose an operation (+, -, *, /). The result of the operation will be displayed.

Example:
```
Welcome to the Simple Calculator!
Enter the first number: 10
Enter the second number: 5
Choose an operation (+, -, *, /): +
Result: 15
```

## Testing

The project includes JUnit tests to ensure the correctness of the calculator functionality and input validation. Run the test classes (`CalculatorTest`, `ComputeTest`, `ValidateInputTest`, `ValidateTest`) to execute the tests.

