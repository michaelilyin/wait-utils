package ru.michaelilyin;

import java.util.function.Supplier;

public class ConditionBuilderImpl<T> implements ConditionBuilder<T> {

    private Supplier<T> supplier;

    public ConditionBuilderImpl(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    @Override
    public <R extends T, Boolean> ConditionBuilderReady<R> truth() {
        return null;
    }
}
