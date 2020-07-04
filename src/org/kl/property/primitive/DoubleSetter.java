package org.kl.property.primitive;

import java.util.function.DoubleUnaryOperator;

public final class DoubleSetter {
	private double value;
	private DoubleUnaryOperator setter;
	
	public DoubleSetter(double value) {
		this.value = value;
	}
	
	public DoubleSetter of(double value) {
		return new DoubleSetter(value);
	}
	
	public void set(double value) {
		if (setter != null) {
			setter.applyAsDouble(value);
			return;
		}
		
		this.value = value;
	}
	
	public DoubleSetter set(DoubleUnaryOperator setter) {
		this.setter = setter;
		
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
		
		DoubleSetter other = (DoubleSetter) object;
		
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value)) {
			return false;
		}
		
		return true;
	}
	
	
}
