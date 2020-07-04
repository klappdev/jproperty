package org.kl.property.primitive;

import java.util.function.LongUnaryOperator;

public final class LongProperty {
	private long value;
	private LongUnaryOperator setter;
	private LongUnaryOperator getter;
	
	public LongProperty(long value) {
		this.value = value;
	}
	
	public LongProperty of(long value) {
		return new LongProperty(value);
	}
	
	public void set(long value) {
		if (setter != null) {
			this.value = setter.applyAsLong(value);
		} else {
			this.value = value;
		}
	}
	
	public LongProperty set(LongUnaryOperator setter) {
		this.setter = setter;
		
		return this;
	}
	
	public long get() {
		if (getter != null) {
			return getter.applyAsLong(value);
		}
		
		return value; 
	}
	
	public LongProperty get(LongUnaryOperator getter) {
		this.getter = getter;
		
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
		
		LongProperty other = (LongProperty) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "LongProperty [value= " + value + "]";
	}
}
