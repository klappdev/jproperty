package org.kl.property.primitive;

public final class IntSetter {
	private int value;
	
	public IntSetter(int value) {
		this.value = value;
	}
	
	public IntSetter of(int value) {
		return new IntSetter(value);
	}
	
	public void set(int value) {
		this.value = value;
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
		
		IntSetter other = (IntSetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "IntSetter [value= " + value + "]";
	}
}
