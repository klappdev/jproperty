package org.kl.property.primitive;

public final class IntGetter {
	private final int value;
	
	public IntGetter(int value) {
		this.value = value;
	}
	
	public IntGetter of(int value) {
		return new IntGetter(value);
	}
	
	public int get() { 
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
		
		IntGetter other = (IntGetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "IntGetter [value= " + value + "]";
	}
}
