package org.example.operationImpl;

import org.example.Calculator;
import org.example.Operation;

public class DivideOperation  implements Operation {
        private double value;

        public DivideOperation(double value) {
            this.value = value;
        }

        @Override
        public void apply(Calculator calculator) {
            calculator.divide(value);
        }

    @Override
    public void applyUndo(Calculator calculator) {
        calculator.multiply(value);
    }

}
