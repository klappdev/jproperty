package org.kl.property.primitive;

import java.util.function.LongUnaryOperator;

public final class LongSetter {
	private long value;
	private LongUnaryOperator setter;
	
	public LongSetter(long value) {
		this.value = value;
	}
	
	public LongSetter of(long value) {
		return new LongSetter(value);
	}
	
	public void set(long value) {
		if (setter != null) {
			setter.applyAsLong(value);
			return;
		}
		
		this.value = value;
	}
	
	public LongSetter set(LongUnaryOperator setter) {
		this.setter = setter;
		
		return this;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + (int) (value ^ (value >>> 32));
		
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
		
		LongSetter other = (LongSetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "LongSetter [value= " + value + "]";
	}
}
