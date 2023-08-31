package org.example;

import org.example.operationImpl.AddOperation;
import org.example.operationImpl.MultiplyOperation;

import java.util.Stack;

/**
 *  操作抽象为独立的类，每个操作类实现了Operation接口，包含执行和回滚操作
 *  将不同的操作逻辑分开
 *  Calculator类的applyOperation方法接受一个操作对象，执行操作并将其添加到历史记录。
 *  undo和redo方法则根据历史记录进行撤销和重做操作。
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.applyOperation(new AddOperation(7));
        calculator.applyOperation(new MultiplyOperation(3));
        System.out.println(calculator.getResult());  // 输出：21.0

        calculator.undo();
        System.out.println(calculator.getResult());  // 输出：7.0

        calculator.redo();
        System.out.println(calculator.getResult());  // 输出：21.0
    }
}
