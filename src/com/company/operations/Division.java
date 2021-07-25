package com.company.operations;

import com.company.Operation;

public class Division implements Operation {

    @Override
    public double operation(int firstNumber, int secondNumber) {
        return (double) firstNumber  / (double) secondNumber;
    }

}
