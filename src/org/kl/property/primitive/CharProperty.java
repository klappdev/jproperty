package org.kl.property.primitive;

public final class CharProperty {
	private char value;
	
	public CharProperty(char value) {
		this.value = value;
	}
	
	public CharProperty of(char value) {
		return new CharProperty(value);
	}
	
	public void set(char value) {
		this.value = value;
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
		
		CharProperty other = (CharProperty) object;
		
		if (value != other.value) {
			return false;
		}
		
		return true;
	}

	@Override
	public String toString() {
		return "CharProperty [value= " + value + "]";
	}
}
