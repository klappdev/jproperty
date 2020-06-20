package org.kl.property.primitive;

public final class ByteSetter {
	private byte value;
	
	public ByteSetter(byte value) {
		this.value = value;
	}
	
	public ByteSetter of(byte value) {
		return new ByteSetter(value);
	}
	
	public void set(byte value) {
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
		if (this == object)  {
			return true;
		}
		
		if (object == null) {
			return false;
		}
		
		if (getClass() != object.getClass()) {
			return false;
		}
		
		ByteSetter other = (ByteSetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "ByteSetter [value= " + value + "]";
	}
}
