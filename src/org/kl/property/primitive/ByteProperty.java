package org.kl.property.primitive;

import org.kl.property.lambda.ByteUnaryOperator;

public final class ByteProperty {
	private byte value;
	private ByteUnaryOperator setter;
	private ByteUnaryOperator getter;
	
	public ByteProperty(byte value) {
		this.value = value;
	}
	
	public ByteProperty of(byte value) {
		return new ByteProperty(value);
	}
	
	public void set(byte value) {
		if (setter != null) {
			this.value = setter.applyAsByte(value);
		} else {
			this.value = value;
		}
	}
	
	public ByteProperty set(ByteUnaryOperator setter) {
		this.setter = setter;
		
		return this;
	}
	
	public byte get() {
		if (getter != null) {
			return getter.applyAsByte(value);
		}
		
		return value; 
	}
	
	public ByteProperty get(ByteUnaryOperator getter) {
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
		
		ByteProperty other = (ByteProperty) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "ByteProperty [value= " + value + "]";
	}
}
