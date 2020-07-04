package org.kl.property.primitive;

import org.kl.property.lambda.ShortUnaryOperator;

public final class ShortProperty {
	private short value;
	private ShortUnaryOperator setter;
	private ShortUnaryOperator getter;
	
	public ShortProperty(short value) {
		this.value = value;
	}
	
	public ShortProperty of(short value) {
		return new ShortProperty(value);
	}
	
	public void set(short value) {
		if (setter != null) {
			this.value = setter.applyAsShort(value);
		} else {
			this.value = value;
		}
	}
	
	public ShortProperty set(ShortUnaryOperator setter) {
		this.setter = setter;
		
		return this;
	}
	
	public short get() {
		if (getter != null) {
			return getter.applyAsShort(value);
		}
		
		return value; 
	}
	
	public ShortProperty get(ShortUnaryOperator getter) {
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
		
		ShortProperty other = (ShortProperty) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "ShortProperty [value= " + value + "]";
	}
}
