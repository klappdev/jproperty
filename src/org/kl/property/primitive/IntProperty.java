package org.kl.property.primitive;

import java.util.function.IntUnaryOperator;

public final class IntProperty {
	private int value;
	private IntUnaryOperator setter;
	private IntUnaryOperator getter;
	
	public IntProperty(int value) {
		this.value = value;
	}
	
	public IntProperty of(int value) {
		return new IntProperty(value);
	}
	
	public void set(int value) {
		if (setter != null) {
			this.value = setter.applyAsInt(value);
		} else {
			this.value = value;
		}
	}
	
	public IntProperty set(IntUnaryOperator setter) {
		this.setter = setter;
		
		return this;
	}
	
	public int get() {
		if (getter != null) {
			return getter.applyAsInt(value);
		}
		
		return value; 
	}
	
	public IntProperty get(IntUnaryOperator getter) {
		this.getter = getter;
		
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
		
		IntProperty other = (IntProperty) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "IntProperty [value= " + value + "]";
	}
}
