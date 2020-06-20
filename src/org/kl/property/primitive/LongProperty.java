package org.kl.property.primitive;

public final class LongProperty {
	private long value;
	
	public LongProperty(long value) {
		this.value = value;
	}
	
	public LongProperty of(long value) {
		return new LongProperty(value);
	}
	
	public void set(long value) {
		this.value = value;
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
