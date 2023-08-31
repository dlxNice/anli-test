package org.example;

public interface Operation {
    void apply(Calculator calculator);
    void applyUndo(Calculator calculator);
}
