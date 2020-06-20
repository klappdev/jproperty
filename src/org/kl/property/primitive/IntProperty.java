package org.kl.property.primitive;

public final class IntProperty {
	private int value;
	
	public IntProperty(int value) {
		this.value = value;
	}
	
	public IntProperty of(int value) {
		return new IntProperty(value);
	}
	
	public void set(int value) {
		this.value = value;
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
		
		IntProperty other = (IntProperty) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "IntProperty [value= " + value + "]";
	}
}
