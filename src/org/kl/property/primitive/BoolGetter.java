package org.kl.property.primitive;

import org.kl.property.lambda.BoolUnaryOperator;

public final class BoolGetter {
	private final boolean value;
	private BoolUnaryOperator getter;
	
	public BoolGetter(boolean value) {
		this.value = value;
	}
	
	public BoolGetter of(boolean value) {
		return new BoolGetter(value);
	}
	
	public boolean get() { 
		if (getter != null) {
			return getter.applyAsBool(value);
		}
		
		return value; 
	}

	public BoolGetter get(BoolUnaryOperator getter) {
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
		
		BoolGetter other = (BoolGetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "BoolGetter [value= " + value + "]";
	}
}
