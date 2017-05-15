package ru.michaelilyin;

import java.util.function.Supplier;

public final class WaitUtils {
    private WaitUtils() { }

    public static <T> ConditionBuilder<T> watch(Supplier<T> supplier) {
        return new ConditionBuilderImpl<>(supplier);
    }
}
