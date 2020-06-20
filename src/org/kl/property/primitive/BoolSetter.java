package org.kl.property.primitive;

public final class BoolSetter {
	private boolean value;
	
	public BoolSetter(boolean value) {
		this.value = value;
	}
	
	public BoolSetter of(boolean value) {
		return new BoolSetter(value);
	}
	
	public void set(boolean value) {
		this.value = value;
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
		
		BoolSetter other = (BoolSetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "BoolSetter [value= " + value + "]";
	}
}
