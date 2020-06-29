package org.kl.property.lambda;

import java.util.Objects;

@FunctionalInterface
public interface ByteUnaryOperator {
	byte applyAsByte(byte operand);

    default ByteUnaryOperator compose(ByteUnaryOperator before) {
        Objects.requireNonNull(before);
        return (byte value) -> applyAsByte(before.applyAsByte(value));
    }

    default ByteUnaryOperator andThen(ByteUnaryOperator after) {
        Objects.requireNonNull(after);
        return (byte value) -> after.applyAsByte(applyAsByte(value));
    }

    static ByteUnaryOperator identity() {
        return value -> value;
    }
}
