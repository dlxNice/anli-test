package org.example;

import java.util.Stack;

public class Calculator {
    //当前值
    private double currentValue;
    //操作历史
    private Stack<Operation> history;
    //前滚历史
    private Stack<Operation> redoHistory;

    public Calculator() {
        currentValue = 0;
        history = new Stack<>();
        redoHistory = new Stack<>();
    }

    public void applyOperation(Operation operation) {
        history.push(operation);
        operation.apply(this);
        redoHistory.clear();
    }

    public void undo() {
        if (!history.isEmpty()) {
            Operation operation = history.pop();
            operation.applyUndo(this);
            redoHistory.push(operation);
        }
    }

    public void redo() {
        if (!redoHistory.isEmpty()) {
            Operation operation = redoHistory.pop();
            operation.apply(this);
            history.push(operation);
        }
    }

    public double getResult() {
        return currentValue;
    }

    public void add(double value) {
        currentValue += value;
    }

    public void subtract(double value) {
        currentValue -= value;
    }

    public void multiply(double value) {
        currentValue *= value;
    }

    public void divide(double value) {
        if (value != 0) {
            currentValue /= value;
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }

}
