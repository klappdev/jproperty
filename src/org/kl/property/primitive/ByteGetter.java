package org.kl.property.primitive;

import org.kl.property.lambda.ByteUnaryOperator;

public final class ByteGetter {
	private final byte value;
	private ByteUnaryOperator getter;
	
	public ByteGetter(byte value) {
		this.value = value;
	}
	
	public ByteGetter of(byte value) {
		return new ByteGetter(value);
	}
	
	public byte get() {
		if (getter != null) {
			return getter.applyAsByte(value);
		}
		
		return value; 
	}
	
	public ByteGetter get(ByteUnaryOperator getter) {
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
		
		ByteGetter other = (ByteGetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "ByteGetter [value= " + value + "]";
	}
}
