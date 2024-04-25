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


```
simple-java-calculator
├─ .classpath
├─ .git
│  ├─ config
│  ├─ description
│  ├─ FETCH_HEAD
│  ├─ HEAD
│  ├─ hooks
│  │  ├─ applypatch-msg.sample
│  │  ├─ commit-msg.sample
│  │  ├─ fsmonitor-watchman.sample
│  │  ├─ post-update.sample
│  │  ├─ pre-applypatch.sample
│  │  ├─ pre-commit.sample
│  │  ├─ pre-merge-commit.sample
│  │  ├─ pre-push.sample
│  │  ├─ pre-rebase.sample
│  │  ├─ pre-receive.sample
│  │  ├─ prepare-commit-msg.sample
│  │  ├─ push-to-checkout.sample
│  │  ├─ sendemail-validate.sample
│  │  └─ update.sample
│  ├─ index
│  ├─ info
│  │  └─ exclude
│  ├─ logs
│  │  ├─ HEAD
│  │  └─ refs
│  │     ├─ heads
│  │     │  ├─ bond
│  │     │  └─ main
│  │     └─ remotes
│  │        └─ origin
│  │           ├─ HEAD
│  │           └─ main
│  ├─ objects
│  │  ├─ 29
│  │  │  └─ 64a41d3032eb939b2ba9bb69955de6a10dd56f
│  │  ├─ 36
│  │  │  └─ 49c0da702ba6fe08f22d300e595e36c0dac392
│  │  ├─ 5b
│  │  │  └─ e7908b4c6072ef78c86bde8c0b8d4721d0eea0
│  │  ├─ 7a
│  │  │  └─ 7604453da3c4809db8ab90a7235af2784e3807
│  │  ├─ e6
│  │  │  └─ 86101be0348c65e6a8087c3581e71a952a2142
│  │  ├─ ef
│  │  │  └─ 6317af17344d924b59fd7ae0c54aab2ee5cd4e
│  │  ├─ info
│  │  └─ pack
│  │     ├─ pack-efe2f105b01e824562459e18a284ab107f3b9f78.idx
│  │     ├─ pack-efe2f105b01e824562459e18a284ab107f3b9f78.pack
│  │     └─ pack-efe2f105b01e824562459e18a284ab107f3b9f78.rev
│  ├─ packed-refs
│  └─ refs
│     ├─ heads
│     │  ├─ bond
│     │  └─ main
│     ├─ remotes
│     │  └─ origin
│     │     ├─ HEAD
│     │     └─ main
│     └─ tags
├─ .gitignore
├─ .project
├─ .settings
│  ├─ org.eclipse.jdt.apt.core.prefs
│  ├─ org.eclipse.jdt.core.prefs
│  └─ org.eclipse.m2e.core.prefs
├─ pom.xml
├─ README.md
└─ src
   ├─ main
   │  └─ java
   │     └─ com
   │        └─ example
   │           ├─ Calculator.java
   │           ├─ Compute.java
   │           ├─ Main.java
   │           └─ Validate.java
   └─ test
      └─ java
         ├─ CalculatorTest.java
         ├─ ComputeTest.java
         ├─ ValidateInputTest.java
         └─ ValidateTest.java

```