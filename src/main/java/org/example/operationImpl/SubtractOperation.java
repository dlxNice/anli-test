package org.example.operationImpl;

import org.example.Calculator;
import org.example.Operation;


public class SubtractOperation implements Operation {
    private double value;

    public SubtractOperation(double value) {
        this.value = value;
    }

    @Override
    public void apply(Calculator calculator) {
        calculator.subtract(value);
    }

    @Override
    public void applyUndo(Calculator calculator) {
        calculator.add(value);
    }
}





