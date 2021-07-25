package com.company;

import com.company.operations.*;

import java.util.Scanner;

public class OperationImpl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the firstNUmber: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the firstNUmber: ");
        int secondNumber = scanner.nextInt();

        Operation add = new Add();
        System.out.println("Add: " + add.operation(firstNumber, secondNumber));

        Operation subtract = new Subtraction();
        System.out.println("Subtract: " + subtract.operation(firstNumber, secondNumber));

        Operation multiplication = new Multiplication();
        System.out.println("Multiply: " + multiplication.operation(firstNumber, secondNumber));

        Operation division = new Division();
        System.out.println("Divide: " + division.operation(firstNumber, secondNumber));

        Operation square = new Square();
        System.out.println("Square: " + square.operation(firstNumber, secondNumber));

        Operation squareRoot = new SquareRoot();
        System.out.println("Square Root: " + squareRoot.operation(firstNumber, secondNumber));
    }
}
