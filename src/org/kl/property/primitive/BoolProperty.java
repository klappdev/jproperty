package org.kl.property.primitive;

import org.kl.property.lambda.BoolUnaryOperator;

public final class BoolProperty {
	private boolean value;
	private BoolUnaryOperator setter;
	private BoolUnaryOperator getter;
	
	public BoolProperty(boolean value) {
		this.value = value;
	}
	
	public BoolProperty of(boolean value) {
		return new BoolProperty(value);
	}
	
	public void set(boolean value) {
		if (setter != null) {
			this.value = setter.applyAsBool(value);
		} else {
			this.value = value;
		}
	}
	
	public BoolProperty set(BoolUnaryOperator setter) {
		this.setter = setter;
		
		return this;
	}
	
	public boolean get() {
		if (getter != null) {
			return getter.applyAsBool(value);
		}
		
		return value; 
	}
	
	public BoolProperty get(BoolUnaryOperator getter) {
		this.getter = getter;
		
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + (value ? 1231 : 1237);
		
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
		
		BoolProperty other = (BoolProperty) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "BoolProperty [value= " + value + "]";
	}
}
