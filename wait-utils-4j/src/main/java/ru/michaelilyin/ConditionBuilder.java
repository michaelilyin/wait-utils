package ru.michaelilyin;

public interface ConditionBuilder<T> {
    <R, D extends Boolean & T> ConditionBuilderReady<R> truth(D t);
}
