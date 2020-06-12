package org.kl.property.primitive;

public final class LongGetter {
	private final long value;
	
	public LongGetter(long value) {
		this.value = value;
	}
	
	public LongGetter of(long value) {
		return new LongGetter(value);
	}
	
	public long get() { 
		return value; 
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
		
		LongGetter other = (LongGetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "LongGetter [value= " + value + "]";
	}
}
