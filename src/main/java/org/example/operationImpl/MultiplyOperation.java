package org.example.operationImpl;

import org.example.Calculator;
import org.example.Operation;


public class MultiplyOperation implements Operation {
    private double value;

    public MultiplyOperation(double value) {
        this.value = value;
    }

    @Override
    public void apply(Calculator calculator) {
        calculator.multiply(value);
    }

    @Override
    public void applyUndo(Calculator calculator) {
        calculator.divide(value);
    }

}





