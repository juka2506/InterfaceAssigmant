package com.company.operations;

import com.company.Operation;

public class Square implements Operation {

    @Override
    public double operation(int firstNumber, int secondNumber) {
        return Math.pow(firstNumber, 2);
    }

}
