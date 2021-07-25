package com.company.operations;

import com.company.Operation;

public class Multiplication implements Operation {

    @Override
    public double operation(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

}
