package org.kl.property.primitive;

public final class ShortProperty {
	private short value;
	
	public ShortProperty(short value) {
		this.value = value;
	}
	
	public ShortProperty of(short value) {
		return new ShortProperty(value);
	}
	
	public void set(short value) {
		this.value = value;
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
		
		ShortProperty other = (ShortProperty) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "ShortProperty [value= " + value + "]";
	}
}
