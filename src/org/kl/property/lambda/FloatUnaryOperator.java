package org.kl.property.lambda;

import java.util.Objects;

@FunctionalInterface
public interface FloatUnaryOperator {
    float applyAsFloat(float operand);

    default FloatUnaryOperator compose(FloatUnaryOperator before) {
        Objects.requireNonNull(before);
        return (float value) -> applyAsFloat(before.applyAsFloat(value));
    }

    default FloatUnaryOperator andThen(FloatUnaryOperator after) {
        Objects.requireNonNull(after);
        return (float value) -> after.applyAsFloat(applyAsFloat(value));
    }

    static FloatUnaryOperator identity() {
        return t -> t;
    }
}
