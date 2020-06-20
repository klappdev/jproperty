package org.kl.property.primitive;

public final class BoolProperty {
	private boolean value;
	
	public BoolProperty(boolean value) {
		this.value = value;
	}
	
	public BoolProperty of(boolean value) {
		return new BoolProperty(value);
	}
	
	public void set(boolean value) {
		this.value = value;
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
		
		BoolProperty other = (BoolProperty) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "BoolProperty [value= " + value + "]";
	}
}
