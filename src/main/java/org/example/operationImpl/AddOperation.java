package org.example.operationImpl;

import org.example.Calculator;
import org.example.Operation;

public class AddOperation implements Operation {
        private double value;

        public AddOperation(double value) {
            this.value = value;
        }

        @Override
        public void apply(Calculator calculator) {
            calculator.add(value);
        }

    @Override
    public void applyUndo(Calculator calculator) {
        calculator.subtract(value);
    }
}
