package org.kl.property.primitive;

import java.util.function.IntUnaryOperator;

public final class IntSetter {
	private int value;
	private IntUnaryOperator setter;
	
	public IntSetter(int value) {
		this.value = value;
	}
	
	public IntSetter of(int value) {
		return new IntSetter(value);
	}
	
	public void set(int value) {
		if (setter != null) {
			setter.applyAsInt(value);
			return;
		}
		
		this.value = value;
	}
	
	public IntSetter set(IntUnaryOperator setter) {
		this.setter = setter;
		
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + value;
		
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
		
		IntSetter other = (IntSetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "IntSetter [value= " + value + "]";
	}
}
