package org.kl.property.lambda;

import java.util.Objects;

@FunctionalInterface
public interface CharUnaryOperator {
    char applyAsChar(char operand);

    default CharUnaryOperator compose(CharUnaryOperator before) {
        Objects.requireNonNull(before);
        return (char value) -> applyAsChar(before.applyAsChar(value));
    }

    default CharUnaryOperator andThen(CharUnaryOperator after) {
        Objects.requireNonNull(after);
        return (char value) -> after.applyAsChar(applyAsChar(value));
    }

    static CharUnaryOperator identity() {
        return t -> t;
    }
}
