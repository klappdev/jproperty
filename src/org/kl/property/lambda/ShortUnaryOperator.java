package org.kl.property.lambda;

import java.util.Objects;

@FunctionalInterface
public interface ShortUnaryOperator {
	short applyAsShort(short operand);

    default ShortUnaryOperator compose(ShortUnaryOperator before) {
        Objects.requireNonNull(before);
        return (short value) -> applyAsShort(before.applyAsShort(value));
    }

    default ShortUnaryOperator andThen(ShortUnaryOperator after) {
        Objects.requireNonNull(after);
        return (short value) -> after.applyAsShort(applyAsShort(value));
    }

    static FloatUnaryOperator identity() {
        return t -> t;
    }
}
