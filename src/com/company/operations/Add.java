package com.company.operations;

import com.company.Operation;

public class Add implements Operation {

    @Override
    public double operation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

}
