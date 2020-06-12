package org.kl.property.primitive;

public final class CharGetter {
	private final char value;
	
	public CharGetter(char value) {
		this.value = value;
	}
	
	public CharGetter of(char value) {
		return new CharGetter(value);
	}
	
	public char get() { 
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
		
		CharGetter other = (CharGetter) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "CharGetter [value= " + value + "]";
	}
}
