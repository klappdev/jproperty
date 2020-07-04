package org.kl.property.primitive;

import org.kl.property.lambda.ShortUnaryOperator;

public final class ShortSetter {
	private short value;
	private ShortUnaryOperator setter;
	
	public ShortSetter(short value) {
		this.value = value;
	}
	
	public ShortSetter of(short value) {
		return new ShortSetter(value);
	}
	
	public void set(short value) {
		if (setter != null) {
			setter.applyAsShort(value);
			return;
		}
		
		this.value = value;
	}
	
	public ShortSetter set(ShortUnaryOperator setter) {
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
		
		ShortSetter other = (ShortSetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "ShortSetter [value= " + value + "]";
	}
}
