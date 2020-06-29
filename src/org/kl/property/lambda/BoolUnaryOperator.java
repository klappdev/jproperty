package org.kl.property.lambda;

import java.util.Objects;

@FunctionalInterface
public interface BoolUnaryOperator {
	boolean applyAsBool(boolean operand);

    default BoolUnaryOperator compose(BoolUnaryOperator before) {
        Objects.requireNonNull(before);
        return (boolean value) -> applyAsBool(before.applyAsBool(value));
    }

    default BoolUnaryOperator andThen(BoolUnaryOperator after) {
        Objects.requireNonNull(after);
        return (boolean value) -> after.applyAsBool(applyAsBool(value));
    }

    static BoolUnaryOperator identity() {
        return t -> t;
    }
}
