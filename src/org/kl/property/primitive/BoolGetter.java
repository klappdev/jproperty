package org.kl.property.primitive;

public final class BoolGetter {
	private final boolean value;
	
	public BoolGetter(boolean value) {
		this.value = value;
	}
	
	public BoolGetter of(boolean value) {
		return new BoolGetter(value);
	}
	
	public boolean get() { 
		return value; 
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
