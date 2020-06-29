package org.kl.property.primitive;

import java.util.function.DoubleUnaryOperator;

public final class DoubleGetter {
	private final double value;
	private DoubleUnaryOperator getter;
	
	public DoubleGetter(double value) {
		this.value = value;
	}
	
	public DoubleGetter of(double value) {
		return new DoubleGetter(value);
	}
	
	public double get() {
		if (getter != null) {
			return getter.applyAsDouble(value);
		}
		
		return value; 
	}
	
	public DoubleGetter get(DoubleUnaryOperator getter) {
		this.getter = getter;
		
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		
		temp = Double.doubleToLongBits(value);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		
		return result;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}
		
		if (object == null) {
			return false;
		}
		
		if (getClass() != object.getClass()) {
			return false;
		}
		DoubleGetter other = (DoubleGetter) object;
		
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value)) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "DoubleGetter [value= " + value + "]";
	}
}
