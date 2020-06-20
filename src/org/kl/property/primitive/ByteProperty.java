package org.kl.property.primitive;

public final class ByteProperty {
	private byte value;
	
	public ByteProperty(byte value) {
		this.value = value;
	}
	
	public ByteProperty of(byte value) {
		return new ByteProperty(value);
	}
	
	public void set(byte value) {
		this.value = value;
	}
	
	public byte get() { 
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
		
		ByteProperty other = (ByteProperty) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "ByteProperty [value= " + value + "]";
	}
}
