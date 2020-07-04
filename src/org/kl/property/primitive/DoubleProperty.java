package org.kl.property.primitive;

import java.util.function.DoubleUnaryOperator;

public final class DoubleProperty {
	private double value;
	private DoubleUnaryOperator setter;
	private DoubleUnaryOperator getter;
	
	public DoubleProperty(double value) {
		this.value = value;
	}
	
	public DoubleProperty of(double value) {
		return new DoubleProperty(value);
	}
	
	public void set(double value) {
		if (setter != null) {
			this.value = setter.applyAsDouble(value);
		} else {
			this.value = value;
		}
	}
	
	public DoubleProperty set(DoubleUnaryOperator setter) {
		this.setter = setter;
		
		return this;
	}
	
	public double get() {
		if (getter != null) {
			return getter.applyAsDouble(value);
		}
		
		return value; 
	}
	
	public DoubleProperty get(DoubleUnaryOperator getter) {
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
		
		DoubleProperty other = (DoubleProperty) object;
		
		if (Double.doubleToLongBits(value) != Double.doubleToLongBits(other.value)) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "DoubleProperty [value= " + value + "]";
	}
}
