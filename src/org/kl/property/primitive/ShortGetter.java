package org.kl.property.primitive;

public final class ShortGetter {
	private final short value;
	
	public ShortGetter(short value) {
		this.value = value;
	}
	
	public ShortGetter of(short value) {
		return new ShortGetter(value);
	}
	
	public short get() { 
		return value; 
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
		
		ShortGetter other = (ShortGetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "ShortGetter [value= " + value + "]";
	}
}
